package homework;

public class Pencil extends Pen {

	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil(String brand, int price) {
		super(brand,price);
	}
	
	public int getPrice() {
		return (int) (super.getPrice()*0.8);
	}

}
