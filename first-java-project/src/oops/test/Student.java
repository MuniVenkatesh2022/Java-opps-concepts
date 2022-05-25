package oops.test;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public Student(int studentId,String studentName,String studentAddress)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=studentAddress;
	}
	public void studentAdmission()
	{
		System.out.println("this is admission method");
	}
	public void studentExam(){
		System.out.println("this is student exam method");
	}
	public void studentResult()
	{
		System.out.println("student result checking method");
	}
	
	public void displayStudentDetails()
	{
		System.out.println("Student details are:"+ studentId+" "+studentName+" "+studentAddress);
	}
	
	
}
