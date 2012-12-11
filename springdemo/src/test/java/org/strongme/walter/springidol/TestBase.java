package org.strongme.walter.springidol;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.strongme.walter.weapon.Soldier;
public class TestBase {
	
	private static ApplicationContext context;
	private MindReader mindReader;
	private Thinker thinker;
	private Soldier soldier;
	private Man man;
	
	@BeforeClass
	public static void initTheContext() {
		context = new ClassPathXmlApplicationContext("context.xml");
	}
	
	@Before
	public void initTheBean() {
		mindReader = (MindReader) context.getBean("magicianWalter");
		thinker = (Thinker) context.getBean("volunteer");
		soldier = (Soldier) context.getBean("army");
		man = (Man) context.getBean("superMan");
	}
	
	@Test
	public void doesTheMagicianisReal() {
		/*String thoughts = "Just guess what i am thinking ?";
		thinker.thinkOfSomething(thoughts);
		assertEquals(thoughts, mindReader.getThoughts());*/
/*		soldier.fight();
		Fly fly = (Fly) soldier;
		fly.fly();*/
		man.beingMan();
		Fly fly = (Fly) man;
		fly.fly();
		Swim swim = (Swim) man;
		swim.swim();
	}
	
}
