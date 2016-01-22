package behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		HardPolice hp=new HardPolice();
		NicePolice np=new NicePolice();
		
		Situation s1=new Situation(hp);
		Situation s2=new Situation(np);
		
		s1.handleByPolice(10);
		s2.handleByPolice(10);

	}

}
