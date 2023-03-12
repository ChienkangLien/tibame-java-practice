package homework;

public class InkBrush extends Pen {

	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public InkBrush(String brand, int price) {
		super(brand,price);
	}
	
	public int getPrice() {
		return (int) (super.getPrice()*0.9);
	}

}
