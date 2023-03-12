package homework;

public class FullTimeEmployee extends Employee {
	private double monthlySalary; // 月薪

	public void display() {
		super.display();
		System.out.println("月薪 = " + monthlySalary);
	}

	public FullTimeEmployee(int empno, String ename, double monthlySalary) {
		super(empno, ename);
		this.monthlySalary = monthlySalary;
	}
	
//	public double getFullTimeSalary() {
//		return monthlySalary;
//	}
	public double getSalary() {
		return monthlySalary;
	}
}
