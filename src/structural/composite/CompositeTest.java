package structural.composite;

public class CompositeTest {
	
	public static void main(String[] args){
		
		Leaf leaf1=new Leaf("1");
		Leaf leaf2=new Leaf("2");
		Leaf leaf3=new Leaf("3");
		
		Composite composite1=new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);
		
		Composite composite2=new Composite();
		composite2.add(leaf3);
		
		composite1.add(composite2);
		composite1.show();
		
	}

}
