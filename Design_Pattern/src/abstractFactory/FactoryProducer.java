package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String  choice) {
		
//		In summary, public static AbstractFactory getFactory(String choice) is a powerful mechanism 
//		within the Abstract Factory design pattern. It promotes loose coupling, centralizes creation logic, and enhances the flexibility 
//		and maintainability of your object creation processes, especially when dealing with families of related objects.
		
		
		
		if(choice.equalsIgnoreCase("SHAPE")) {
			
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("COLOR")) {
			
			return new ColorFactory();
		}else {
			
			return null;
		}
	
	}
}
