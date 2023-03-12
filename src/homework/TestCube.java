package homework;

public class TestCube {
	public static void main(String[] args) {
		try {
//			Cube c = new Cube(-1);
//			c.showVolume();
			
			Cube c = new Cube();
			c.setLength(0);
			c.showVolume();
			
			
		} catch (CubeException e) {
			e.printStackTrace();
		}
		
		
	}

}
