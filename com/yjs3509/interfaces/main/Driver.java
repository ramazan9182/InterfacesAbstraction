package com.yjs3509.interfaces.main;

import com.yjs3509.interfaces.domain.Circle;
import com.yjs3509.interfaces.domain.Color;
import com.yjs3509.interfaces.domain.Shape;
import com.yjs3509.interfaces.domain.Triangle;

public class Driver {

	public static void main(String[] args) {
		
		
		Shape shape = new Triangle();
//		shape.setColor("BLUE");
		shape.setColor(Color.WHITE);
		System.out.println(shape.getColor());
		
		shape = new Circle();
//		shape.setColor("RED");
		shape.setColor(Color.BLUE);
		System.out.println(shape.getColor());
		
		
	}
}
