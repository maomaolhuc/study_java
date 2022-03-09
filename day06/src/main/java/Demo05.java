public class Demo05 {

	public static void main(String[] args) {
		B b = new B();

	}

}

class A{
	A(){
		System.out.println("A");
	}
}

class B{
	B(){
		System.out.println("B");
	}
	A a1 = new A();
}