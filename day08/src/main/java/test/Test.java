package test;

public class Test {

	public static void main(String[] args) {
		PhoneClass yd = new Yidong("求知若渴", "123456");
		PhoneClass lt = new Liantong("狼人", "1110");
		PhoneClass dx = new Dianxin("小小树", "911111");
		yd.sendMessage("大西瓜","我爱你");
		lt.call("付帅帅");
		dx.sendMessage("xq","老师好");
	}

}
