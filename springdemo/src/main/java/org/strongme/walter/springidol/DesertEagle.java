package org.strongme.walter.springidol;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.strongme.walter.weapon.Gun;

public class DesertEagle implements Gun {
	
	private List<Bullet> bullets;

	public DesertEagle() {
		
	}
	
	@Inject
	public DesertEagle(BulletProvider provider) {
		bullets = new ArrayList<Bullet>();
		for(int i=0;i<5;i++) {
			bullets.add(provider.getBullet());
		}
		
	}
	
	
	
	public void shoot() {
		// TODO Auto-generated method stub

	}

}
