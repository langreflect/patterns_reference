package creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder=new LunchOrder.Builder();
		
		builder.bread("wheat").dressing("mayo").meat("turkey");
		
		LunchOrder lunchOrder=builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());

	}

}
