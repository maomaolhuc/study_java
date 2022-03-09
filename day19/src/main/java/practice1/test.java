package practice1;

public class test {
	public static void main(String[] args) {
		Cursor c1 = new Cursor("nice", true);
		Cursor c2 = new Cursor("james", false);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
