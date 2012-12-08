package org.strongme.walter.realweapon;

import org.strongme.walter.weapon.Bomb;
import org.strongme.walter.weapon.Gun;
import org.strongme.walter.weapon.Soldier;

public class Army implements Soldier {
	
	private Gun gun;
	private Bomb bomb;

	public Gun getGun() {
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
	}

	public void fight() {
		System.out.println("Start fight...");
		gun.shoot();
		bomb.explode();
		System.out.println("Fight over...");

	}

}
