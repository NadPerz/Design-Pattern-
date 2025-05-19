package commandPattern;

public class OffCommand  implements Command{
	// concrete command
	
	Light light;

//	constructor injection
	public OffCommand(Light light) {

		this.light = light;
	}

	@Override
	public void execute() {

		light.off();
	}

 
	
}
