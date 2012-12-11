package org.strongme.walter.springidol;

public class Magician implements MindReader {
	
	private String thoughts;

	public void interceptThoughts(String thoughts) {
		System.out.println("From Maginican Intercepting the volunteer's thoughts...");
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
