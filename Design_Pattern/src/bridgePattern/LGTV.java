package bridgePattern;

public class LGTV implements TV {

	@Override
	public void on() {

		System.out.println("Turn on LG Tv");
	}

	@Override
	public void off() {

		System.out.println("Turn off LG Tv");

	}

	@Override
	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Tune LG Tv");

	}

}
