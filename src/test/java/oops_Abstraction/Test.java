package oops_Abstraction;

public class Test extends Student{

	public static void main(String[] args) {
		//a normal class can extend an abstract class but it has to create the body of the unimplemented method of the abstract class
		//can't create the object of the abstract class but can create the object of class which extends the methods of abstract class and with that help methods can be retrieved
		Test test = new Test();
		test.studentElection();
		test.studentLibrary();
		test.studentExam();

	}
	
	public void studentElection() {
		System.out.println("This is the studentElection method which has been overridden from the student class");
	}
	
	public void studentExam() {
		System.out.println("This is the studentExam nethod which has been overridden from the student class");
		
	}

}
