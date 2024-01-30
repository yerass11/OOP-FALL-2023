package practice4;

public class Circle extends Shape{
	private int radius;
	public Circle() {
		super();
	}
	public Circle(Color color, int position, int radius) {
		super(color,position);
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.print(" ".repeat(position));
		if(color == Color.WHITE) {
			System.out.println("("+" ".repeat(radius)+")");
		}
		else {
			System.err.println("("+" ".repeat(radius)+")");
		}
	}
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Circle["+super.toString()+", Radius="+ radius+"]";
	}
}
