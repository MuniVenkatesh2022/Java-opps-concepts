package oops.test;

public class ConstructorDemo {
	
	private int personId;
	private String personName;
	ConstructorDemo()
	{
		this(35,"Muni Venkatesh");
		System.out.println("this is default constructor");
	}
	ConstructorDemo(int personId,String personName)
	{
		this.personId=personId;
		this.personName=personName;
		this.displayPerson();
	}
	public void displayPerson()
	{
		System.out.println("parametarized constructed invocked");
		System.out.println("PersonId->"+personId);
		System.out.println("PersonName->"+personName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo d=new ConstructorDemo();
		System.out.println(d);
	}

}
