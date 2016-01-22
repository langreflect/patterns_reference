package structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Apple apple1=new Apple();
		apple1.getAppleColor("green");

		Orange orange=new Orange();
		AppleAdapter aa=new AppleAdapter(orange);
		aa.getAppleColor("red");
	}

}
