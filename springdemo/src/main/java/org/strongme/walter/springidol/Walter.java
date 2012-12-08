package org.strongme.walter.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class Walter implements Performer {

	//@Autowired(required=false)//写这都不用 写set方法的
//	@Qualifier("piano")
	@StringedInstrument
	@Strummed
	private Instrument instrument;
	
	public void perform() throws PerformanceExecpion {
		// TODO Auto-generated method stub
		System.out.print("Walter is playing : ");
		instrument.play();
		
	}

}
