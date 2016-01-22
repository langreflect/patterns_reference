package structural.flyweight;

public class FlyweightDemo {
	
	public static void main(String[] args){
		
		InventorySystem ims = new InventorySystem();

		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Samsung TV", 323);
		ims.takeOrder("Roomba", 563);
		
		ims.process();
		
		System.out.println(ims.report());
	}

}
