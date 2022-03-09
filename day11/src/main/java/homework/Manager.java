package homework;

public class Manager extends Employee{
	private String department;
	private static final double JINTIE = 1500;

	public Manager(String name, double salary, String address, int hol,String department) {
		super(name, salary, address, hol);
		this.department = department;
	}
	
	@Override
	public double calculateTotal() {
		return this.Salary + JINTIE + this.Salary * 0.2;
	}
	
	@Override
	public void show() {
		super.show();
		double total = calculateTotal();
		double sal = total - calculateLessPay();
		System.out.println(this.department + "部门.总工资:"+total+",实际工资:"+sal);
	}
	
	
}
