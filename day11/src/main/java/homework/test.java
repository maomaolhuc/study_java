package homework;

public class test {
	public static void main(String[] args) {
		Director d = new Director("阿辉", 40000, "长沙", 5, 3000);
		d.show();
		
		Manager m = new Manager("李大钊", 1000, "北京", 100, "革命");
		m.show();
	}
}
