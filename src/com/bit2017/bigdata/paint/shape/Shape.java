package com.bit2017.bigdata.paint.shape;
import com.bit2017.bigdata.paint.i.Drawable;

public abstract class Shape implements Drawable {
	private String fillColor;
	private String lineColor;
	
	Shape() {
		System.out.println("Shape class default constructor");
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public abstract void draw();
}
