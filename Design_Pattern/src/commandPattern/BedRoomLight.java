package commandPattern;

public class BedRoomLight implements Light {

	@Override
	public void on() {

		System.out.println("Turn on Bed Room Light");
	}

	@Override
	public void off() {

		System.out.println("Turn off Bed Room Light");

	}

}
