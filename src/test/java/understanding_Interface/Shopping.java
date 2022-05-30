package understanding_Interface;

public interface Shopping {
	
	//interface in java is a reference type
	//interface is pure abstraction
	//collection of abstract methods
	//A Class implements an interface, thereby inheriting the abstract methods of the interface
	//interface can contain - constants, default methods, static methods, nested types,  abstract methods
	//methods bodies in interface only exist for default and static methods
	//main method is also allowed in interface
	//any declaration of a datatype in interface is final in nature
	
	public void launchurl(); //this is an abstract method and they can't be static
	public void login();
	public void landingPageValidation();
	public void selectItem();
	public void addtoCart();
	public void payment();
	public void logout();
	
	//you have to add body to the static method in an interface
	public static void tokenValidation() {
		System.out.println("This is token Validation");
	}
	public static void main(String[]args) {
		System.out.println("This is the main method in an interface");
		tokenValidation();
	}
	

}
