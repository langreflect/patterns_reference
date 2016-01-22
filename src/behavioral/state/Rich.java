package behavioral.state;

public class Rich implements State {

	@Override
	public void saySomething(StateContext sc){
		System.out.println("I'm rich curently, and play a lot.");
		sc.changeState(new Poor());
	}
}
