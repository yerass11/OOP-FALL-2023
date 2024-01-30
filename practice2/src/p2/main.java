package p2;

public class main {

	public static void main(String[] args) {
		
		StartTriangle small = new StartTriangle(3);
		System.out.println(small.toString());
		
		System.out.println();
		
		StartTriangle big = new StartTriangle(10);
		System.out.println(big.toString());
		
	}	
}