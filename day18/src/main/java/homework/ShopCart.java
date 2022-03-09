package homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ShopCart {
	// 装商品的car
	Map<Product, Integer> productMap;
	public double total;

	public ShopCart() {
		this.productMap = new LinkedHashMap<>();
	}
	
	// 添加商品
	public void add(Product p, int num){
		// 没有商品
		if(!productMap.containsKey(p)){
			productMap.put(p, num);
		}else{
			// 有商品 增加
			int order = productMap.get(p).intValue();
			productMap.put(p, order+num);
		}
		total += p.getPrice()*num;
	}
	
	// 添加一个
	public void add(Product p){
		add(p, 1);
	}
	
	// 删除 1个
	public void remove(Product p,int num){
		// 不存在
		if(!productMap.containsKey(p)){
			System.out.println("没有这个商品");
		}else{
			// 存在 10   
			int order = productMap.get(p).intValue();
			if(order > num){
				productMap.put(p, order-num);
				total -= p.getPrice()*num;
			}else if(order < num){
				System.out.println("抱歉没有这么多商品删除");
			}else{
				productMap.remove(p);
				total -= p.getPrice()*num;
			}
			
		}
	}
	
	
	public void clearCar(){
		productMap.clear();
		total = 0;
	}
	
	// 打印购物车信息
	public void print(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("购物清单:\n");
		
		// 显示商品 商品列表
		Set<Product> set = productMap.keySet();
		for (Iterator<Product> iterator = set.iterator(); iterator.hasNext();) {
			Product product = iterator.next();
			int num = productMap.get(product);
			sb.append("商品:"+product.getName()+",数量:"+num+",单价:"+product.getPrice()+"\n");
		}
		sb.append("祝你购买愉快总价格是:"+total);
		System.out.println(sb);
		
	}
	
	
}
