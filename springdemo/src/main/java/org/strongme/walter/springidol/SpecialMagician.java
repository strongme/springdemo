package org.strongme.walter.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpecialMagician implements MindReader {

	private String thoughts;
	
	@Pointcut("execution(* org.strongme.walter.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts) {}
	
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer'sthoughts : "+thoughts);
		this.thoughts=thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
