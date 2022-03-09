package test;

/**
 * 
 * 定义的就是打电话 发短信 具体的打电话去计费
 * @author xq
 *
 */
public abstract class PhoneClass {
	public String name;
	public String tel;
	
	
	
	public PhoneClass(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public abstract void sendMessage(String name, String msg);
	
	public abstract void call(String name);
		
}
