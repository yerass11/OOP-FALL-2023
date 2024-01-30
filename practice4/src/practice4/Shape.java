package practice4;

public abstract class Shape {
	protected Color color;
	protected int position;
	public Shape() {
		
	}
	public Shape(Color color,int position) {
		this.color=color;
		this.position=position;
		
	}
	public abstract void draw();
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String toString() {
		return "Color="+color+" ,Position="+position;
	}

}
