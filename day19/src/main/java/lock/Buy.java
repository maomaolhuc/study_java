package lock;

public class Buy implements Runnable{
	private Account  ac;
	private double price;
	private String name;
	public Buy(String name,Account ac, double price) {
		this.name = name;
		this.price = price;
		this.ac = ac;
	}


	@Override
	public void run() {
		ac.buy(price);
	}
}
