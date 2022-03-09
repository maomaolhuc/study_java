package homework2;

public class Iphone extends Phone implements Net,Elec{
	
	public static void main(String[] args) {
		Iphone p = new Iphone("黑色", "8plus");
		p.getCall("鸡公煲");
		p.sendCall("黄焖鸡");
		p.getInterNet();
		
	}
	
	private String color;
	private String paizi;
	public Iphone(String color, String paizi) {
		super();
		this.color = color;
		this.paizi = paizi;
	}
	
	@Override
	public void sendCall(String name) {
		System.out.println("facetime视频通话"+name);
	}
	
	@Override
	public void getCall(String name) {
		System.out.println(name+"接电话");
	}
	
	@Override
	public void getInterNet() {
		System.out.println("移动蜂窝网络");
		
	}
	
	@Override
	public void on() {
		System.out.println("长按home开机");
		
	}
	
	@Override
	public void off() {
		System.out.println("长按home关机");
	}
	
}
