package com.epam;

interface Shape {
	
	String draw();
	
}

class Oval implements Shape {
	@Override
	public String draw() {
		return "Shape: Oval";
	}
}

class Triangle implements Shape {
	   @Override
	   public String draw() {
	      return "Shape: Triangle";
	   }
}

abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public String draw(){
	      return decoratedShape.draw();
	   }	
}

class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public String draw() {	       
	      String msg = setRedBorder(decoratedShape);
	      return decoratedShape.draw()+msg;
	   }

	   private String setRedBorder(Shape decoratedShape){
	      return "\nBorder Color: Red";
	   }
	}







