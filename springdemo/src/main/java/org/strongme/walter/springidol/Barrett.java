package org.strongme.walter.springidol;

import org.springframework.stereotype.Component;
import org.strongme.walter.weapon.Gun;

@Component
public class Barrett implements Gun {

	public void shoot() {
		System.out.println("大炮响起！");	
	}

}
