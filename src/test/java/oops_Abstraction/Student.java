package oops_Abstraction;

public abstract class Student {
	String name;
	int stuID;
	//in abstract class abstract methods are there
	//methods which do not have a body are abstract methods
	
	public abstract void studentElection();//this is an abstract method which reside only in an abstract class
	                                       //an abstract method cannot reside inside a normal class
	                                       //a normal method can reside in an abstract class
	
	public void studentLibrary() {
		System.out.println("This is the normal student library method inside an abstract class");
	}
	
	public abstract void studentExam(); 

}
