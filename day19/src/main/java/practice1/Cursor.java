package practice1;

public class Cursor implements Runnable{
	private String name;
	boolean flag = true;
	public Cursor(String name, boolean flag) {
		this.name = name;
		this.flag = flag;
	}

	public static Bank bank = new Bank();
	
	@Override
	public void run() {
		
		if(flag){
			for(int i=0;i<5;i++){
				bank.add(200, name);
			}
			
		}else{
			for(int i=0;i<10;i++){
				bank.qu(100, name);
			}
		}
	}
}
