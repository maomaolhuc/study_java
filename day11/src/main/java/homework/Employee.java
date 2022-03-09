package homework;

public abstract class Employee {
	protected String name;
	protected double Salary;
	protected String address;
	protected int hol;
	public Employee(String name, double salary, String address, int hol) {
		super();
		this.name = name;
		Salary = salary;
		this.address = address;
		this.hol = hol;
	}
	
	public double calculateLessPay(){
		double s = 0;
		if(hol >= 5){
			s = this.Salary * 0.5;
		}else{
			s = this.Salary * 0.25;
		}
		return s;
	}
	
	abstract public double calculateTotal();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public void show() {
		System.out.println("Employee [name=" + name + ", Salary=" + Salary + ", address=" 
				+ address + ", hol=" + hol + "]");
	}
	
	
	
	
}
