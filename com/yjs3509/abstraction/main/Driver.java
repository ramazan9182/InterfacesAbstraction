package com.yjs3509.abstraction.main;

import com.yjs3509.abstraction.domain.Shape;
import com.yjs3509.abstraction.domain.Square;
import com.yjs3509.abstraction.domain.Triangle;
import com.yjs3509.util.Shapes;

public class Driver {
	

	public static void main(String[] args) {
		
		//??
//		Shape shape = new Shape(); // CAN NOT INSTANTIATE !!!
		Shape shape = new Triangle("RED");
		Shape shape2 = new Square();
		System.out.println(shape.getColor());
		System.out.println(shape2.getColor());
		
		
		
		Shapes.drawShape(shape);
		Shapes.drawShape(shape2);
		
	}
}
