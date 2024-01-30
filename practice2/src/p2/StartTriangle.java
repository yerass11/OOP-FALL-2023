package p2;

public class StartTriangle {

	public int width;
	
	public StartTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		String s = "", word = "[*]";
		for (int i = 1; i <= this.width; i++) {
			s += word.repeat(i) + '\n';
		}
		return s;
	}
}
