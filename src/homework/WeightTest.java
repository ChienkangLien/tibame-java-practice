package homework;

public class WeightTest {
	public static void main(String[] args) {
		Weightable[] w = new Weightable[3];
		
		w[0] = new Dog1("Eric",10.0);
		w[1] = new Plane("Alice",20000.0);
		w[2] = new Powder("Foo",0.001);
		
		for (int i = 0; i < w.length; i++ ) {
			w[i].getWeightTool();
		}
	}
}
