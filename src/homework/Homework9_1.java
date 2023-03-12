package homework;

public class Homework9_1 {
	public static void main(String[] args) {
		LineRole Moon = new LineRole("饅頭人");
		LineRole James = new LineRole("詹姆士");
		Thread tMoon = new Thread(Moon);
		Thread tJames = new Thread(James);
		
		System.out.println("---大胃王快食比賽開始!!---");
		tMoon.start();
		tJames.start();
		
		try {
			tMoon.join();
			tJames.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("---大胃王快食比賽結束!!---");
	}

}

class LineRole implements Runnable {
	private String name;

	public LineRole(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(name + "吃了第" + i + "碗飯");
			try {
				Thread.sleep((long) ((Math.random() * 2500) + 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name+"吃完了~");
	}
}
