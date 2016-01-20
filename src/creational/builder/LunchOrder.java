package creational.builder;

public class LunchOrder {

	public static class Builder {
		private String bread;
		private String dressing;
		private String meat;
		
		public Builder(){
			
		}
		
		//build metoda koja kreira objekat na kraju
		public LunchOrder build(){
			return new LunchOrder(this);
		}
		
		public Builder bread(String bread){
			this.bread=bread;
			return this;
		}
		
		public Builder dressing(String dressing){
			this.dressing=dressing;
			//svaka metoda vraca this kako bi moglo da se napravi ulancavanje
			return this;
		}
		
		public Builder meat(String meat){
			this.meat=meat;
			return this;
		}
	}
	
	//polja i metode klase ciji objekat pravimo
	private final String bread;
	private final String dressing;
	private final String meat; 
	
	private LunchOrder(Builder builder){
		this.bread=builder.bread;
		this.dressing=builder.dressing;
		this.meat=builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
	
	
}
