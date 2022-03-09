package throwDemo;

public class Demo01 {
	public static void main(String[] args){
		/*
		 * 第二种方式 捕获  解决问题了
		 * try...catch
		 * 1. catch 是可以写很多个的 但是只会执行一个
		 * 2. catch 一定要从小到大写
		 */
		
		York y = new York();
		try {
			y.say("哈哈哈");
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e.toString());
//			y.otherSay("我爱你");
		}
	}
}

class York{
	
	public void say(String name) throws Exception{
		if(name == "我爱你"){
			System.out.println(name);
		}else{
			throw new Exception("我就知道你不爱我");
		}
	}
	
	public void otherSay(String name){
		System.out.println(name);
	}
}





