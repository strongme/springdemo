package org.strongme.walter.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Introducer {
	
	@DeclareParents(value="org.strongme.walter.springidol.Man+",
										defaultImpl=FlyBird.class)
	public static  Fly fly;
	
	@DeclareParents(value="org.strongme.walter.springidol.Man+",
										defaultImpl=Fish.class)	
	public static Swim swim;

}
