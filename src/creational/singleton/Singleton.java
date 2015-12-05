package creational.singleton;

// primer Singletona u JDK je Runtime i getRuntime()
public class Singleton {
	// instanca koja ce biti vracena
	private static Singleton INSTANCE;

	// private konstruktor, jer objekat pravimo preko gettera
	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			//synch se radi nad klasom, zato sto sinhronizujemo koriscenje static metode
			synchronized (Singleton.class) {
				//sada kada imamo lock, jos jedna provera da nije vec napravljen objekat
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}

}
