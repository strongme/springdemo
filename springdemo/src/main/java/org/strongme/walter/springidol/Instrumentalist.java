package org.strongme.walter.springidol;

import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class Instrumentalist implements Performer {
	
	private Instrument instrument;
	
	private String song;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() throws PerformanceExecpion {
		System.out.print("Playing "+song+" : ");
		instrument.play();
	}

}
