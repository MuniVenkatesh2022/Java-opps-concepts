package oops.test;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp=new Employee(25,"Mr.Muni","Manager","Chennai",30000);
		emp.displayEmaployeeDetials();
		emp.calculateHRA();
		emp.calculateDA();
		emp.calculateTAX();
	}

}
