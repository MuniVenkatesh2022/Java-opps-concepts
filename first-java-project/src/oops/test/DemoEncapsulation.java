package oops.test;

class Encapsulation
{
	//private cann't access out side of the class
	//using public getter and setter methond we can access
	private String name;
	private int  rollNo=25;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
	
	
}

public class DemoEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en=new Encapsulation();
		en.setName("Muni");
		en.setAge(21);
		
		System.out.println(en.toString());
		
		System.out.println(en.getName()+" "+en.getRollNo()+" "+en.getAge());
		
		

	}

}
