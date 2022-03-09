package homework;

public class Director extends Employee{
	private static final double JINTIE = 5000;
	private double transportAllowance;

	public Director(String name, double salary, String address, int hol,double transportAllowance ) {
		super(name, salary, address, hol);
		// TODO Auto-generated constructor stub
		this.transportAllowance = transportAllowance;
	}
	@Override
	public double calculateTotal() {
		// 实际工资 = 总工资 - 扣除
		return this.Salary + JINTIE;
	}
	
	public void show(){
		super.show();
		double total = calculateTotal();
		double sal = total - calculateLessPay() + this.transportAllowance;
		// 45000 - 20000 + 3000
		System.out.println("总工资:"+total+",实际工资:"+sal);
	}
		
}
