package org.strongme.walter.springidol;

import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class Juggler implements Performer {

	private int beanBags = 3;
	
	public Juggler() {}
	
	public void actionBeforeStage() {
		System.out.println("Get Ready To Go On The Stage");
	}
	
	public void actionAfterStage() {
		System.out.println("Finished And Get Away From The Stage");
	}
	
	public Juggler(int beanBags) {
		this.beanBags  = beanBags;
	}
	
	public void perform() throws PerformanceExecpion {
		System.out.println("JUGGLING "+beanBags+" BEANBAGS");
	}

}
