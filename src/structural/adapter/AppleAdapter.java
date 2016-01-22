package structural.adapter;

//orange ce se ponasati kao apple
public class AppleAdapter extends Apple {

	private Orange orange;
	
	public AppleAdapter(Orange orange){
		this.orange=orange;
	}
	
	public void getAppleColor(String color){
		orange.getOrangeColor(color);
	}
}
