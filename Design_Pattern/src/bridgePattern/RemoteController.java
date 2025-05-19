package bridgePattern;

public class RemoteController {

	TV tv;
	
	public RemoteController(TV tv) {
		this.tv = tv;
		
	}
	
	void onPushed() {
		tv.on();
	}
	
	void offPushed() {
		tv.off();
	}
	
	void tuneChanel() {
		tv.tune();
	}
	
	
}
