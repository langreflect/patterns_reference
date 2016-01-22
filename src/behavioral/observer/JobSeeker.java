package behavioral.observer;

public class JobSeeker implements Observer {

	private String name;
	
	public JobSeeker(String name){
		this.name=name;
	}
	
	@Override
	public void update(Subject s) {
		System.out.println(this.name+" got notified!");
		System.out.println(s);

	}

}
