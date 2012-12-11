package org.strongme.walter.springidol;

import org.springframework.stereotype.Component;

@Component
public class FlyBird implements Fly {

	public void fly() {
		System.out.println("Fly like a bird away!");
	}

}
