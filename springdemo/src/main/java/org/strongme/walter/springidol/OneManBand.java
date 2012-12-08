package org.strongme.walter.springidol;

import java.util.Collection;
import java.util.Map;

import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class OneManBand implements Performer {

//	private Collection<Instrument> instruments;
	private Map<String,Instrument> instruments;
	
	/*public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}*/

	public void perform() throws PerformanceExecpion {
		/*for(Instrument instrument : instruments) {
			instrument.play();	
		}*/
		for(String key : instruments.keySet()) {
			System.out.print(key+" : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

}
