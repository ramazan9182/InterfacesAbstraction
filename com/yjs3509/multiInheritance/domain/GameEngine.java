package com.yjs3509.multiInheritance.domain;

public final class GameEngine {

	public static void flyGameObject(Flyable flyable) {
		flyable.fly();
		
	}

	public static void swimGameObject(Swimmable swimmable) {
		swimmable.swim();
	}
	
	
}
