package practice4;
import java.util.Vector;
public class TestShape {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Vector<Shape> shapes = new Vector<Shape>();
			Circle c = new Circle(Color.WHITE, 4,2);
			Rectangle r = new Rectangle(Color.WHITE, 4,4,4);
			Triangle t = new Triangle(Color.RED, 4,4);
			shapes.add(c);
			shapes.add(r);
			shapes.add(t);
			System.out.println(shapes);
			for(Shape sh : shapes) {
				if(sh instanceof Circle) {
					((Circle)sh).draw();
				}
				if(sh instanceof Rectangle) {
					((Rectangle)sh).draw();
				}
				if(sh instanceof Triangle) {
					((Triangle)sh).draw();
				}
			}
			
		}
}