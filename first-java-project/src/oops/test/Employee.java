package oops.test;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeAddress;
	private int employeeSalary;
	
	
	public Employee(int employeeId, String employeeName, String employeeDesignation, String employeeAddress,
			int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}
	
	public void calculateHRA()
	{
		double hra=(this.employeeSalary*10)/100;
		System.out.println("hra->"+ hra);
	}
	public void calculateDA()
	{
		double da=(this.employeeSalary*50)/100;
		System.out.println("DA->"+da);
	}
	public void calculateTAX()
	{
		double tax=(this.employeeSalary*20)/100;
		System.out.println("TAX->"+tax);
	}
	
	public void displayEmaployeeDetials()
	{
		System.out.println("EmployeeID->"+employeeId);
		System.out.println("EmployeeName->"+employeeName);
		System.out.println("EmployeeDesignation->"+employeeDesignation);
		System.out.println("EmployeeAddress->"+employeeAddress);
		System.out.println("EmployeeSalary->"+employeeSalary);
		
	}

}
