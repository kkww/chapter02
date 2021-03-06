package com.bit2017.bigdata.paint.point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); //this.setX(x); this.setY(y);
		setColor(color);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//@Override
	//public void test() {} //override할 test라는 method가 없음
	
	@Override
	public void show() {
		System.out.println("[x=" + getX() + ",y=" + getY() + "]에 " + color + "점을 그렸습니다.");
	}
}
