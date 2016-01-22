package creational.factory;

public class HumanFactory {

	public static Human createHuman(String m){
		Human p=null;
		if ("boy".equals(m)){
			p=new Boy();
		} else if ("girl".equals(m)){
			p=new Girl();
		}
		return p;
	}

}
