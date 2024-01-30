package practice4;

public class Triangle extends Shape{
    private int side;
    public Triangle() {
		super();
	}
	public Triangle(Color color,int  position,int side) {
		super(color,position);
		this.side = side;
		
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.print(" ".repeat(position));
		if(color==Color.WHITE) {
			System.out.println("/"+"\\");
			int cnt=1;
			int c=1;
			for(int i=1;i<side-1;i++){
			System.out.println((" ".repeat(position-cnt)+"/"+" ".repeat(2*c)+"\\" ));
		    cnt++; 
		    c++;
			}
			
			System.out.print(" ".repeat(position-side+1)+"/");
			System.out.println("--".repeat(side-1)+"\\");
			
			
		}	
		else {
				System.err.println("/"+"\\");
				int cnt=1;
				int c=1;
				for(int i=1;i<side-1;i++){
				System.err.println((" ".repeat(position-cnt)+"/"+" ".repeat(2*c)+"\\" ));
			    cnt++; 
			    c++;
				}
				
				System.err.print(" ".repeat(position-side+1)+"/");
				System.err.println("--".repeat(side-1)+"\\");
				
				
			}	
		
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public String toString() {
		return "Triangle["+super.toString()+ ", Side="+ side+"]";
	}
}
