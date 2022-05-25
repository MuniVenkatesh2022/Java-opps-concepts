package oops.test;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student(25,"Muni","Chennai");
		Student stu=new Student(26,"venkatesh","Mumbai");
		
		stu.studentAdmission();
		stu.studentExam();
		stu.studentResult();
		stu.displayStudentDetails();
		
		
		student.studentAdmission();
		student.studentExam();
		student.studentResult();
		student.displayStudentDetails();

	}

}
