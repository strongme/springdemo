package org.strongme.walter.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MagicianWalter implements MindReader {

	private String thoughts;
	
	@Pointcut("execution(* org.strongme.walter.springidol.Thinker.thinkOfSomething(String) ) && args(thoughts)")
	public void thinking(String thoughts) {}
	
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("From Magician Walter Intercept the volunteer's thoughts: "+thoughts);
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}

}
