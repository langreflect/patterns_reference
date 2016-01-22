package behavioral.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		HeadHunter hh=new HeadHunter();
		hh.registerObserver(new JobSeeker("Mike"));
		hh.registerObserver(new JobSeeker("Joe"));
		hh.registerObserver(new JobSeeker("Jeff"));
		
		hh.addJob("Google job");
		hh.addJob("Yahoo job");

	}

}
