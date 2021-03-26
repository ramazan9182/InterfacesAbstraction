package com.yjs3509.interfaceExtensiblity.main;

import com.yjs3509.interfaceExtensiblity.domain.ConcreteVampire;
import com.yjs3509.interfaceExtensiblity.domain.GodZilla;
import com.yjs3509.interfaceExtensiblity.domain.Monster;

//S.O.L.I.D. Principles

// Design Pattern ???
//Strategy Design Pattern
//Factory Design Pattern

public class Driver {
	
	public static void main(String[] args) {
		
		Monster concreteVampire = new ConcreteVampire();
		
		Monster monster = new GodZilla();
		
		monster.menace();
//		((GodZilla)monster).destroy(); // downcasting
		
	}
	
}
