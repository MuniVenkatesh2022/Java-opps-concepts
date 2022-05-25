package oops.test;

public class StudentClass {
	private String name;
	private int age;
	private String address;
	
	StudentClass()
	{
		this.name="Unknown";
		this.age=0;
		this.address="Not available";
	}
	
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
 
	@Override
	public String toString() {
		return "StudentClass [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		StudentClass st=new StudentClass();
		System.out.println(st);
		
		StudentClass st2=new StudentClass();
		st2.setInfo("Muni", 21);
		System.out.println(st2);
		
		StudentClass st3=new StudentClass();
		st3.setInfo("Venaktesh", 21, "Chennai");
		System.out.println(st3);
		
	}
}
