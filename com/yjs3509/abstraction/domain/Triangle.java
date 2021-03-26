package com.yjs3509.abstraction.domain;

public class Triangle extends Shape {

	
	public Triangle() {
		
	}
	
	public Triangle(String color) {
		super(color);
	}
	
	@Override
	public void draw() {
		System.out.println("Triangle.draw");
		
	}

}
