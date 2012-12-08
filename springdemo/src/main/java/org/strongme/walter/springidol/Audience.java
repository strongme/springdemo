package org.strongme.walter.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}
	
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cell phones.");
	}
	
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP");
	}
	
	public void demandRefund() {
		System.out.println("Boo! We want our monet back!");
	}
	
	public void calculateTime(ProceedingJoinPoint joinPoint) {
		System.out.println("The audience is taking their seats.");
		System.out.println("The audience is turning off their cell phones.");
		try {
			long start = System.nanoTime();
			joinPoint.proceed();
			long end = System.nanoTime();
			System.out.println("The performence took "+(end-start)+" nanoseconds");
		} catch (Throwable e) {
			System.out.println("Boo! We want our monet back!");
		}
		System.out.println("CLAP CLAP CLAP CLAP");
		
		
		
	}
}
