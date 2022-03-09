package diff;

public class Duotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		A b = new B();
		// System.out.println(b.num);
		b.say();
	}

}

class A{
	 int num = 10;
	  void say(){
		 System.out.println("A");
	 }
	 
	 
}

class B extends A{
	int num = 20;
	 void say(){
		 System.out.println("B");
	 }

}
