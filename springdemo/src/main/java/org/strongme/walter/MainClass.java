package org.strongme.walter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.strongme.walter.springidol.Contestant;
import org.strongme.walter.springidol.FireTheAudience;
import org.strongme.walter.springidol.Juggler;
import org.strongme.walter.springidol.Performer;
import org.strongme.walter.springidol.exception.PerformanceExecpion;

public class MainClass {
	
	public static void main(String[] args) throws PerformanceExecpion {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
/*		Soldier army = (Soldier) context.getBean("army");
		army.fight();*/		
	/*	Juggler duke = (Juggler) context.getBean("Duke");
		duke.perform();*/
		/*Juggler poeticDuke = (Juggler) context.getBean("poeticDuke");
		poeticDuke.perform();*/
		
		Performer performer = (Performer) context.getBean("carl");
		performer.perform();
		
		Contestant contestant = (Contestant) performer;
		contestant.receiveAward();
		
		FireTheAudience fireTheAudience= (FireTheAudience) performer;
		fireTheAudience.fireTheAudience();
	}

}
