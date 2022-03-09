package lock;

public class test {

	public static void main(String[] args) {
		Account ac = new Account("星空", 10000);
		Buy b1 = new Buy("星空的女朋友",ac, 2000);
		Buy b2 = new Buy("星空的男朋友",ac, 1000);
		
		new Thread(b1).start();
		new Thread(b2).start();
		

	}

}
