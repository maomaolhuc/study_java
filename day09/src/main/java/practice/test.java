package practice;

public class test {

	public static void main(String[] args) {
		
		Point p = new Point(3, 4);
		p.draw();
		
		Circle c = new Circle(10);
		c.draw();
		
		Line l = new Line(new Point(3, 4), new Point(5, 10), "red");
		l.draw();
		
		ArrowLine al = new ArrowLine(new Point(3, 4), new Point(5, 10) ,"left");
		al.draw();

	}

}
