package abstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String Color) {
		
		if(Color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(Color.equalsIgnoreCase("GREEN")) {
			
			return new Green();
		}else if(Color.equalsIgnoreCase("BLUE")) {
			
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String type) {

		return null;
	}

	
}
