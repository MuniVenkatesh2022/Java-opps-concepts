package oops.test;

public class EmployeeTwo {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	
	
	  public EmployeeTwo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeTwo(int id, String firstName, String lastName, int salary) {
	  super(); this.id = id; this.firstName = firstName; this.lastName = lastName;
	  this.salary = salary; }
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return this.salary * 12;
	}

	public int raiseSalary(int percentage) {
		return this.salary + (this.salary * percentage) / 100;
	}

	
	  @Override public String toString() { return "EmployeeTwo [id=" + id +
	  ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
	  + "]"; }
	 

	public static void main(String[] args) {
		EmployeeTwo emp = new EmployeeTwo(101, "Muni", "Venkatesh", 40000);
		System.out.println(emp.getAnnualSalary());
		System.out.println(emp.raiseSalary(10));

		System.out.println(emp.toString());

		EmployeeTwo emp2 = new EmployeeTwo();
		emp2.setId(112);
		emp2.setFirstName("Eswear");
		emp2.setLastName("babu");
		emp2.setSalary(60000);
		System.out.println(emp2.getId());
		System.out.println(emp2.getFirstName());
		System.out.println(emp2.getLastName());
		System.out.println(emp2.salary);
		System.out.println(emp2.getAnnualSalary());
		System.out.println(emp2.raiseSalary(5));
		System.out.println(emp2);

	}
}