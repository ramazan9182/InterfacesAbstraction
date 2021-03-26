package com.yjs3509.interfaces.domain;

public abstract class Shape implements Colorable {

	private String color;

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return color;
	}

}
