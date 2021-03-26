package com.yjs3509.abstraction.domain;

public abstract class Shape{
	
	private String color;
	
	public Shape() {
		this("BLACK");
	}
	
	public Shape(String color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		// calculate the color value range
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public abstract void draw();
	
	
}
