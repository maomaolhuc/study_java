package throwDemo2;

public class Student {

	public static void main(String[] args) {
		Student s = new Student();
		try {
			s.zuobi();
		} catch (HelpException e) {
			System.out.println("求救");
			// System.out.println("抄队友的啊");
			// System.out.println("向老师借, 老师谢谢你");
			System.out.println("小纸条走起");
		}
	}
	
	
	public void zuobi() throws HelpException{
		System.out.println("等答案");
		Phone p = new Phone();
		try {
			p.getMsg(false);
		} catch (KaException e) {
			System.out.println("卡机吗");
			 p.rstart();
			 System.out.println("重新接短信");
			// xiameng();
			System.out.println("答案来了");
		} catch (MoException e) {
			System.out.println("手机被没收了");
			// p.anOtherPhone();
			// xiameng();
			// System.out.println("答案来了");
			
			// 手机没了 又不想蒙  出了这个问题 能不能解决? 不能抛了 转换异常
			// throw e;
			throw new HelpException("胸弟快给我抄一下,我不行了");
		}
	}
	
	public void xiameng(){
		System.out.println("出问题我就蒙");
	}
}
