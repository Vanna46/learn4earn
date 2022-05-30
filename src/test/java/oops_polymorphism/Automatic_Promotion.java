package oops_polymorphism;

public class Automatic_Promotion {

	public static void main(String[] args) {
		Automatic_Promotion ap = new Automatic_Promotion();
		ap.display(1);
		ap.display('c');
		//byte->short->int->long
  //char converts into int// and int converts to float ->float/double/long 
		               //long converts to double and float //->double

	}
	public void display(int i) {
		System.out.println("This is an int datatype single parameter method");
	}
	public void display(String S) {
		System.out.println("This is a String datatype single parameter rmethod");
	}

}
