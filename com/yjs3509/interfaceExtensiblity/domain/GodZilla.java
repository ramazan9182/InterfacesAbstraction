package com.yjs3509.interfaceExtensiblity.domain;

public class GodZilla implements DangerousMonster{

	@Override
	public void menace() {
		System.out.println("GodZilla is menacing .... ");
	}

	@Override
	public void destroy() {
		System.out.println("GodZilla is destroying .... ");
	}
	
}
