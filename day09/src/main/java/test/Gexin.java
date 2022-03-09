package test;

public class Gexin {
	
	// 喜欢甜美的
//	public void seek(Sweet s){
//		s.say();
//	}
//	
//	// 傻妹子
//	public void seek(Foolish f){
//		f.say();
//	}
//	
//	// hanzi
//	public void seek(Nvhanzi f){
//		f.say();
//	}
	
	
	// xq老师教给你一招 以不变应万变的方法 追女生的方法  代码的复用性 提高了
	/*
	 *  多态 Girl 接受不同的子类的女孩子
	 *  通过父类型引用操作子类型 执行父类的方法
	 *  就是让子类向上转型 继承来自父类的方法 调用子类重写父类的方法
	 *  好处: 提高了代码的复用性
	 *       提高程序扩展性
	 *  
	 *  前提:
	 *     必须要有继承关系  重写操作
	 *  
	 */
	public void seek(Girl g){
		g.say();
	}
	
	public void dou(Girl g){
		// 出问题啦
		// 子类去向上转型了之后  无法去调用自己的特有方法了
		// 如果想要执行子类的特有方法的话 就要变回子类型 强制转换 向下转型
		// 子类型的引用指向了父类型
		// Sweet s = (Sweet)g; // 编译的时候没有去报错 jvm比较笨
		// jvm笨蛋 nice 聪明的孩子  instanceof 偷偷的看了下包裹
		// 向下转型存在风险 父类变成子类 存在风险
		if(g instanceof Sweet){
			Sweet s = (Sweet)g;
			s.sajiao();
		}else if(g instanceof Nvhanzi){
			Nvhanzi s = (Nvhanzi)g;
			s.sajiao();
		}
	}
	
	
	
}
