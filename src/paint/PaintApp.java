package paint;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(100);
		
		//point.show();
		//drawPoint(point1); //static method는 static method에서만 부를 수 있음.
		
		Point point2 = new Point(100, 200);
		drawPoint(point1);
		drawPoint(point2);
		
		point2.show(true);
		point2.show(false);
	}
	public static void drawPoint(Point pt) {
		pt.show();
	}
}
