package org.strongme.walter.realweapon;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;
import org.strongme.walter.weapon.Bomb;
import org.strongme.walter.weapon.Gun;
import org.strongme.walter.weapon.Soldier;

@Component
public class Army implements Soldier {
	
	@Inject
	@Named("barrett")
	private Gun gun;
	@Inject
	@Named("c4")
	private Bomb bomb;

	/*public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}

	public Bomb getBomb() {
		return bomb;
	}

	public void setBomb(Bomb bomb) {
		this.bomb = bomb;
	}*/

	
	public void fight() {
		System.out.println("Start fight...");
		gun.shoot();
		bomb.explode();
		System.out.println("Fight over...");

	}

}
