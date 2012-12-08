package org.strongme.walter.springidol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpecialAudience {
	
	@Pointcut("execution(* org.strongme.walter.springidol.Performer.perform(..))")
	public void performence() {}
	
	@Before("performence()")
	public void takeSeats() {
		System.out.println("The special audience is taking their seats");
	}
	
	@Before("performence()")
	public void turnOffCellPhones() {
		System.out.println("The special audience is turning off their cell phones");
	}
	
	@AfterReturning("performence()")
	public void appluad() {
		System.out.println("CLAP CLAP CLAP CLAP");
	}
	
	@AfterThrowing("performence()")
	public void demanRefund() {
		System.out.println("Boo! We want our money back !");
	}
	

}
