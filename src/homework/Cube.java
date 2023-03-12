package homework;

public class Cube {
	private double length;

	public Cube() {
	}

	public Cube(double length) throws CubeException  {
		if (length <= 0.0) {
			throw new CubeException("正立方體邊長不得為0或是負數");
		} else {
			this.length = length;
		}
		
//		setLength(length);
	}

	public void setLength(double length) throws CubeException {
		if (length <= 0.0) {
			throw new CubeException("正立方體邊長不得為0或是負數");
		} else {
			this.length = length;
		}
	}

	public double getLength() {
		return length;
	}

	public void showVolume() {
		System.out.println(Math.pow(length, 3));
	}

}
