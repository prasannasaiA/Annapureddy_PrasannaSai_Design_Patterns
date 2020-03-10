package com.epam;

interface Quadrilateral{
	String draw();
}

class Rectangle implements Quadrilateral {
	
	@Override
	public String draw() {
		return "Inside Rectange: draw() method";
	}
	
}

class Square implements Quadrilateral {
	
	@Override
	public String draw() {
		return "Inside Square: draw() method";
	}
	
}

public class FactoryDesignPattern{
	
	Quadrilateral getQuadrilateral(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		
		else if(shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();
		
		return null;
	}
	
}




















