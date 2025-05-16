package sigleton;
import java.util.Arrays;

public class Sigleton {
	
	private static Sigleton firstInstance = null;
	
	
	private Sigleton() {
		System.out.println("Sigleton instance created");
	}
	
	public static Sigleton getInstance () {
		
		if (firstInstance == null) {
			
			synchronized (Sigleton.class) {
				
				if(firstInstance == null) {
				
					firstInstance = new Sigleton();
				}
			}
			
		}
		
		return firstInstance;
	}
	
	
}
