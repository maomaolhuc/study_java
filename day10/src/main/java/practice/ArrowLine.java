package practice;

public class ArrowLine extends Line {
	private String arrow;
	
	public ArrowLine(Point p1, Point p2,String arrow) {
		super(p1, p2);
		this.arrow = arrow;
	}
	

	public String getArrow() {
		return arrow;
	}


	public void setArrow(String arrow) {
		this.arrow = arrow;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("方向为"+arrow);
	}
}
