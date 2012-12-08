package org.strongme.walter.springidol;

import org.springframework.stereotype.Component;

@Component
@ForJakker
@StringedInstrument
public class Saxophone implements Instrument {
	
	public Saxophone() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
