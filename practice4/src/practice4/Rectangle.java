package practice4;

public class Rectangle extends Shape {
	private int height;
	private int lenght;
	public Rectangle() {
		super();
	}
	public Rectangle(Color color,int  position, int height, int lenght) {
		super(color,position);
		this.height = height;
		this.lenght = lenght;
	}
	@Override
	public void draw() {
		System.out.print(" ".repeat(position));
		if(color.equals(Color.WHITE)) {
			System.out.print("|");
			System.out.print("-".repeat(lenght));
			System.out.print("|\n");
			for(int i=1;i<height-1;i++){
				System.out.println(" ".repeat(position)+"|"+" ".repeat(lenght)+"|" );
				
			}
			System.out.print(" ".repeat(position)+"|");
			System.out.print("-".repeat(lenght));
			System.out.println("|");
				
		}	
		else  {
			System.err.print("|");
			System.err.print("-".repeat(lenght));
			System.err.print("|\n");
			for(int i=1;i<height-1;i++){
				System.err.println(" ".repeat(position)+"|"+" ".repeat(lenght)+"|" );
				
			}
			System.err.print(" ".repeat(position)+"|");
			System.err.print("-".repeat(lenght));
			System.err.println("|");
				
		}	
		// TODO Auto-generated method stub
		
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	int getLenght() {
		return lenght;
	}
	void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public String toString() {
		return "Rectangle["+super.toString()+ ", Height="+height+", Lenght="+lenght+"]";
	}
	
}
