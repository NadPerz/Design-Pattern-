package FactoryPatttern;

public class ShapeFactory   {

//	use Shape metod to get object of type shape
	
	public shape getShape(String shapeType) {
		
		
		if(shapeType == null) {
			
		}
	
	
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			
			return new Square();
		}
		
		
		
		
		
		return null;

		
	}
}
