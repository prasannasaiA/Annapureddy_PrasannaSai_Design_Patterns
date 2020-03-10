package com.epam;

interface DrawCircle{
	
	String drawCircle(int radius, int x, int y);
	
}

class RedCircle implements DrawCircle {
	
	@Override
	public String drawCircle(int radius, int x, int y) {
		
		return "Drawing a Circle of Color RED and of radius "+radius+" with centre ("+x+","+y+")"; 
	
	}
}

class BlueCircle implements DrawCircle {
	
	@Override
	public String drawCircle(int radius, int x, int y) {
		
		return "Drawing a Circle of Color Blue and of radius "+radius+" with centre ("+x+","+y+")"; 
	
	}
}

abstract class Circle {
	
	protected DrawCircle drawcircle;
	
	protected Circle(DrawCircle drawcircle) {
		this.drawcircle=drawcircle;
	}
	
	public abstract String draw();
	
}

public class CircleBridgePattern extends Circle {
	
	private int x, y, radius;
	
	public CircleBridgePattern(int x, int y, int radius, DrawCircle drawcircle) {
		super(drawcircle);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public String draw() {
		return drawcircle.drawCircle(radius, x, y);
	}
	
}




















