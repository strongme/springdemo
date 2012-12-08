package org.strongme.walter.springidol;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class Jaker implements Performer {

	@Inject
//	@Named("saxophone")
	@ForJakker
	private Instrument instrument;
	
	@Value("#{systemEnvironment.JAVA_HOME} for #{T(java.lang.Math).random()*10} times")
	private String song;
	
	public void perform() throws PerformanceExecpion {
		System.out.print("Jaker is playing 【"+song+"】 : ");
		instrument.play();
	}

}
