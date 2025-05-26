package FactoryPatttern;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();
		
//		get an object Circle and call its draw method
		shape shape1 = shapeFactory.getShape("CIRCLE");
		
//		call draw method  of circle 
		shape1.draw();
		
		shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
		
		
		
		
		
	}

}
