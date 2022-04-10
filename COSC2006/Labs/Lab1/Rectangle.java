import java.io.Serializable;

public class Rectangle extends GeometricObject implements Serializable, Comparable<Rectangle> {

	private static final long serialVersionUID = 1L;
	
	private int width = 1;
	private int height = 2;
	
	private MyPoint location = new MyPoint(0,0);
	
	
	public Rectangle() {
		super.setColor("Black");
		super.setFilled(true);
	}
	
	public Rectangle (String color, boolean isFilled, int width, int height) {
		super.setColor(color);
		super.setFilled(isFilled);
		this.width = width;
		this.height = height;
	}
	
	//*****************************************************************
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public MyPoint getLocation() {
		return location;
	}

	public void setLocation(MyPoint location) {
		this.location = location;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	//********************************************************************
	
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle rec = ((Rectangle) o);
			return (rec.getWidth() == width && rec.getHeight() == height)
			||	(rec.getWidth() == height && rec.getHeight() == width);
		}	
		return false;
	}
	
	@Override
	public int compareTo(Rectangle rec) {
		if(rec.getArea() > this.getArea()) return 1;
		else if(rec.getArea() < this.getArea()) return -1;
		return 0;
	}

	//*******************************************************************
	
	@Override
	public String toString() {
		return "Rectangle: w x h at " + super.toString();
	}
}
