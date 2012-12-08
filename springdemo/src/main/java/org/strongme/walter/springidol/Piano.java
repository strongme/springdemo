package org.strongme.walter.springidol;

import org.springframework.stereotype.Component;

@Component
//自定义Qualifier
@Strummed
@StringedInstrument
public class Piano implements Instrument {
	
	public Piano() {
	}
	

	public void play() {
		System.out.println("PLINK PLINK PLINK");

	}

}
