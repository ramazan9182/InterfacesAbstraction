package com.yjs3509.multiInheritance.main;

import com.yjs3509.multiInheritance.domain.GameEngine;
import com.yjs3509.multiInheritance.domain.SuperHero;

public class Driver {

	
	public static void main(String[] args) {
		
		SuperHero superHero = new SuperHero();
		
		GameEngine.flyGameObject(superHero);
		
		
		GameEngine.swimGameObject(superHero);
		
		
	}
}
