package practice;

public class test {

	public static void main(String[] args) {
		
		Point p = new Point(3, 4);
		// p.draw();
		
		Circle c = new Circle(10);
		// c.draw();
		
		Line l = new Line(new Point(3, 4), new Point(5, 10), "red");
		// l.draw();
		
		ArrowLine al = new ArrowLine(new Point(3, 4), new Point(5, 10) ,"left");
		// al.draw();

		ShapeDraw sd = new ShapeDraw();
		sd.add(p);
		sd.add(c);
		sd.add(l);
		sd.add(al);
		sd.draw();
		
	}
}



class ShapeDraw{
	private Shape[] arr = new Shape[20];
	private int num = 0;
	public void add(Shape shape){
		if(num < arr.length){
			arr[num++] = shape;
		}
	}
	
	public void draw(){
		for(int i=0;i<num;i++){
			//if(arr[i] != null){
				arr[i].draw();
			//}
		}
	}
}
















