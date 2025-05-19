package commandPattern;

public class Main {

	public static void main(String[] args) {

		Light bedRoomLight = new BedRoomLight();
		Light livingRoomLight = new LivingRoomLight();
		
		Command onCommandBedRoomLight = new OnCommand(bedRoomLight);
		Command offCommandBedRoomLight = new OffCommand(bedRoomLight);

		
		Command onCommandLivingRoomLight = new OnCommand(livingRoomLight);
		Command offCommandLivingRoomLight = new OffCommand(livingRoomLight);

//		use same remote both bed room and living room or if we want separate we can use two different remote 
		RemoteController remoteController = new RemoteController();
		
		remoteController.setCommand(onCommandBedRoomLight, offCommandBedRoomLight);
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();
		
		remoteController.setCommand(onCommandLivingRoomLight, offCommandLivingRoomLight);
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();
		
	}

}
