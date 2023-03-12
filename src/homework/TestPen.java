package homework;

public class TestPen {
	public static void main(String[] args) {
		Pen p1 = new Pencil("鉛筆",100);
		Pen p2 = new InkBrush("毛筆",200);
		
		p1.write();
		p2.write();
				
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		
	}

}
