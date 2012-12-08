package org.strongme.walter.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AttachFireFunctionAspect {
	
	@DeclareParents(value="org.strongme.walter.springidol.Performer+",defaultImpl=FireWithRoar.class)
	public static FireTheAudience audience;
	

}
