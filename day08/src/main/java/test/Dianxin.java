package test;

public class Dianxin extends PhoneClass{
	public Dianxin(String name, String tel) {
		super(name, tel);
	}
	
	@Override
	public void sendMessage(String name, String msg) {
		System.out.println(this.name+"====发送短信"+ msg + "发送到"+name);
	}
	@Override
	public void call(String name) {
		System.out.println(this.name+"打电话给"+ name );
	}
}
