package com.yjs3509.multiInheritance.domain;


//SuperHero is a Character.
//SuperHero is a Swimable.
//SuperHero is a Fightable.
//SuperHero is a Flyable.
public class SuperHero extends Character implements Swimmable,Fightable,Flyable{

	@Override
	public void swim() {
		// Swim calculation
		System.out.println(" swimming...");
	}

	@Override
	public void fly() {
		// Fly calculation
		
		System.out.println(" flying...");
	}
	

}
