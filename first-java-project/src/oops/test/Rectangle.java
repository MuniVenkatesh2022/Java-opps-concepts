package oops.test;

public class Rectangle {
	private float width;
	private float height;
	
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public double Area()
	{
		return this.width*this.height;
	}
	
	public double Perimeter()
	{
		return 2*(this.width+this.height);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setWidth(15);
		r.setHeight(20);
		System.out.println(r.toString());
		System.out.println(r.Area());
		System.out.println(r.Perimeter());
	}
}
