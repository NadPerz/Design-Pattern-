package bridgePattern;

public class Main {

	public static void main(String[] args) {

		new RemoteController(new LGTV()).onPushed();
		new RemoteController(new SonyTV()).offPushed();
		new RemoteController(new SonyTV()).tuneChanel();
		
	}

}
