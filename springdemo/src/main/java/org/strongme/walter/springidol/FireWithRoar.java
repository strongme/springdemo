package org.strongme.walter.springidol;

import org.springframework.stereotype.Component;

@Component
public class FireWithRoar implements FireTheAudience {

	public void fireTheAudience() {
		System.out.println("Roaring : Just stand up and shot with me ! FuFo...");

	}

}
