package throwDemo;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(false);
		} catch (AException e) {
			System.out.println(1);
		} catch (BException e) {
			System.out.println(2);
		} 
		
	}
	
	
	public static void method(boolean flag) throws AException,BException{
		if(flag){
			throw new AException();
		}else{
			throw new BException();
			
		}
	}
}


class AException extends Exception{

	public AException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class BException extends Exception{

	public BException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}



