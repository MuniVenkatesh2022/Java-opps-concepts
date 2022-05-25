package oops.test;

class A
{
	int var=25;
	String name="Muni";
	String address="Tirupathi";
	A()
	{
		System.out.println("This is Constructor method");
		
	}
	
	public void dis()
	{
		System.out.println("Method in class a");
	}
}

class B extends A
{
	B()
	{
		super();
		System.out.println(super.var+" "+super.name+" "+super.address);
		super.dis();
	}
}
public class SuperDemo {
	
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b);
	}

}
