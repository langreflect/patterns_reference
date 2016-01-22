package structural.bridge;

public class SamsungTV implements ITV {

	@Override
	public void on() {
		System.out.println("Samsung TV is turned on");

	}

	@Override
	public void off() {
		System.out.println("Samsung TV is turned off");

	}

	@Override
	public void switchChannel(int channel) {
		System.out.println("Samsung: channel - "+channel);

	}

}
