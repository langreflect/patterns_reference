package structural.bridge;

public class BridgeDemo {

	public static void main(String[] args) {
		ITV tv=new SonyTV();
		//prosledjujemo implementaciju koja ce biti koriscena
		LogitechRemoteControl lrc=new LogitechRemoteControl(tv);
		lrc.setChannelKeyboard(100);

	}

}
