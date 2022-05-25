package oops.test;

class Member
{
	private String Name;
	private int Age;
	private long Phone_number;
	private String Address;
	private double Salary;
	
	
	public Member(String name, int age, long phone_number, String address, double salary) {
		super();
		this.Name = name;
		this.Age = age;
		this.Phone_number = phone_number;
		this.Address = address;
		this.Salary = salary;
	}
	
	
	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}


	public long getPhone_number() {
		return Phone_number;
	}

	public String getAddress() {
		return Address;
	}

	public double getSalary() {
		return Salary;
	}

	public void printSalary()
	{
		System.out.println(this.Salary);
	}
	
}
class EmployeeNew extends Member
{
	private String specialization;

	EmployeeNew(String name, int age, long phone_number, String address, double salary,String specialization)
	{
		super(name,age,phone_number,address,salary);
		this.specialization=specialization;
	}

	public String getSpecialization() {
		return specialization;
	}
	
	
}

class Manager extends Member
{
	private String department;
	
	Manager(String name, int age, long phone_number, String address, double salary,String department)
	{
		super(name,age,phone_number,address,salary);
		this.department=department;
	}

	public String getDepartment() {
		return department;
	}
	
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeNew emp=new EmployeeNew("Muni",21,94413526,"Tirupathi",30000,"Computer Application");
		System.out.println(emp);
		Manager mg=new Manager("Venkatesh",23,63029432,"Chennai",45000,"HR");
		
		System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getPhone_number()+" "+emp.getAddress()+" "+emp.getSalary()+" "+emp.getSpecialization());
		System.out.println(mg.getName()+" "+mg.getAge()+" "+mg.getPhone_number()+" "+mg.getAddress()+" "+mg.getSalary()+" "+mg.getDepartment());
	}

}
