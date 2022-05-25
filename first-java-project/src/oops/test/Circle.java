package oops.test;

public class Circle {

	private double radius;
	
	Circle()
	{
		System.out.println("Default Constructer is calling....");
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double gerRadius() {
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	public double getCircumference()
	{
		return 2*Math.PI*this.radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(20);
		System.out.println(c.toString());
		System.out.println(c.getArea());
		System.out.println(c.getCircumference());
		
	}
}
