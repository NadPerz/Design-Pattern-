package commandPattern;

public class OnCommand implements Command {

//	concrete comand 
	// same as algorithm selector in stratergy pattern
	//run time can assign any 
	Light light;
	
	
	// constructur injection
 	public OnCommand(Light light) {

		this.light = light;
		
	}


 	

	@Override
	public void execute() {

		light.on();
	}

}
