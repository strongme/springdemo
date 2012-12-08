package org.strongme.walter.springidol;

public class Volunteer implements Thinker {
	
	private String thoughts;
	
	public String getThoughts() {
		return thoughts;
	}

	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}

}
