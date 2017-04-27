package paint;

public class Point implements Drawable {
	private int x;
	private int y;
	
	Point() {
		System.out.println("Point class default constructor");
	}
	
	Point(int x, int y) {
		System.out.println("Point class (int,int) constructor");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("[x=" + x + ",y=" + y + "]에 점을 그렸습니다.");
	}
	public void show(boolean visible) {
		if(visible)
			show();
		else
			System.out.println("[x=" + x + ",y=" + y + "]에 점 사라짐");
	}

	@Override
	public void draw() {
		show();
	}
}
