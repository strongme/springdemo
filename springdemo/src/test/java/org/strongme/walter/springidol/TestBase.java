package org.strongme.walter.springidol;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
public class TestBase {
	
	private static ApplicationContext context;
	private MindReader mindReader;
	private Thinker thinker;
	
	@BeforeClass
	public static void initTheContext() {
		context = new ClassPathXmlApplicationContext("context.xml");
	}
	
	@Before
	public void initTheBean() {
		mindReader = (MindReader) context.getBean("magician");
		thinker = (Thinker) context.getBean("volunteer");
	}
	
	@Test
	public void doesTheMagicianisReal() {
		String thoughts = "Just guess what i am thinking ?";
		thinker.thinkOfSomething(thoughts);
		assertEquals(thoughts, mindReader.getThoughts());
	}
	
}
