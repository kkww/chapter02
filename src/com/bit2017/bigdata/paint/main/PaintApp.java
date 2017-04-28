package com.bit2017.bigdata.paint.main;

import com.bit2017.bigdata.paint.i.*;
//import com.bit2017.bigdata.paint.i.Drawable;

import com.bit2017.bigdata.paint.point.*;
//import com.bit2017.bigdata.paint.point.ColorPoint;
//import com.bit2017.bigdata.paint.point.Point;

import com.bit2017.bigdata.paint.shape.*;
//import com.bit2017.bigdata.paint.shape.Circle;
//import com.bit2017.bigdata.paint.shape.Rect;
//import com.bit2017.bigdata.paint.shape.Triangle;

public class PaintApp {

	public static void main(String[] args) {
		Integer i0 = new Integer(9);
		Integer i1 = 10;
		int i2 = 11;
		
		System.out.println("point1-----------------------");
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(100);
		
		//point.show();
		//drawPoint(point1); //static method는 static method에서만 부를 수 있음.
		
		System.out.println("point2-----------------------");
		Point point2 = new Point(100, 200);
		draw(point1);//drawPoint(point1);
		draw(point2);//drawPoint(point2);
		
		point2.show(true);
		point2.show(false);

		System.out.println("point3(ColorPoint extends Point)-----------------------");
		Point point3 = new ColorPoint(200, 100, "red");
		//point3.show();
		point3.show(true);
		draw(point3);//drawPoint(point3);
		
		System.out.println("rect(Rect extends Shape)-----------------------");
		Rect rect = new Rect();
		rect.draw();
		draw(rect);//drawShape(rect);
		
		System.out.println("circle(Circle extends Shape)-----------------------");
		Circle circle; // = new Circle();
		//circle.draw();
		draw(new Circle());//drawShape(new Circle());
		draw(new Triangle());
	}
	/*public static void drawPoint(Point pt) {
		pt.show();
	}
	public static void drawShape(Shape s) {
		s.draw();
	}*/
	
	/*public static void draw(Shape s) { //fillColor, lineColor 등은 Point에서 사용하지 않음
		s.draw();
	}*/
	
	public static void draw(Drawable d) { //interface로 공통 부분인 draw()를 정의해놓을 수 있다. (구현은 다른 calss에서 함. interface/abstract가 아닌)
		d.draw();
	}
}
