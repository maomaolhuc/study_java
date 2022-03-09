package throwDemo2;

// 看手机答案呢  手机响了 手机没电了 手机卡了 手机被没收了
public class Phone {
	
	
	public void getMsg(boolean flag) throws KaException, MoException{
		if(flag){
			throw new KaException("哎哟喂急死我了,咋就卡了呢");
		}else{
			throw new MoException("好气啊,手机被没收了");
		}
	}
	
	public void rstart(){
		System.out.println("重启手机");
	}
	
	public void anOtherPhone(){
		System.out.println("哈哈哈, 我还有一个");
	}
}
