package structural.bridge;

public class SonyTV implements ITV {

	@Override
	public void on() {
		System.out.println("Sony TV is turned on");

	}

	@Override
	public void off() {
		System.out.println("Sony TV is turned off");

	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("Sony: channel - "+channel);

	}

}
