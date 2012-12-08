package org.strongme.walter.springidol;

import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() throws PerformanceExecpion {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}

}
