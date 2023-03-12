package homework;

public class Employee {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
		this(empno, "-");
		
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("ename = " + ename);
	}
	
	public static void main(String[] args) {
		FullTimeEmployee f = new Manager(1,"1",1,1);
		Employee j = f;
		FullTimeEmployee a = (FullTimeEmployee)j;
		Manager k = (Manager)a;
		f=k;
		System.out.println(j==f);
		System.out.println(a==f);
		System.out.println(k==f);
		
		Employee e = new FullTimeEmployee(1,"1",1);
		FullTimeEmployee g = (FullTimeEmployee)e;
		Employee e1 = new FullTimeEmployee(1,"1",1);
		System.out.println(e1 instanceof FullTimeEmployee);
		
	}
}
