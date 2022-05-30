package methods_functions;

public class Method_Concepts {
	
	//Method is an independent unit of execution. It is a kind of like a factory, 
	//in which raw material is supplied and we end up getting an end product.
	//types of methods in Java - 
	//1.User-defined Method
	//2. Standard Library Method

	public static void main(String[] args) {
		//main method is where the execution happens
		int m = addNumbers();
		System.out.println(m);
		
		String str4 = meString();
		System.out.println(str4);
		
		Method_Concepts objref = new Method_Concepts();
		objref.helloWorld(); 
		
		bedroom1();
		objref.bedroom();
		
		locker1();
		objref.locker1();
		

	}
	//declare a method
	
	//returntype methodname(){
	   //Write logic
	//}
	public static int addNumbers() {
		int i = 10;
		int j = 20;
		int sum = i+j;
		//System.out.println(sum);
		return sum;
	}
	
	public static String meString() {
		String str1 = "Vandna";
		String str2 = "Sodhi";
		String str3 = str1 + str2;
		//System.out.println(str3);
		return str3;
	}
	
	public void helloWorld() {
		System.out.println("Hello, World");
	}
	
	/*
	 * char richChar() { char c1 = '$'; char c2 = 'H'; char c3 = c1 + c2; return c3;
	 * }
	 */
	
	//private, protected, default
	
	private void bedroom() {
		System.out.println("This is a bedroom primate method");
	}
	
	private static void bedroom1() {
		System.out.println("This is a static bedroom private method");
	}
	
	protected void locker() {
		System.out.println("This is a locker method");
	}
	
	protected static void locker1() {
		System.out.println("This is a protechted void method");
	}
	
	//default methods are only allowed in interfaces not in classes
	/*
	 * default static void trying() {
	 * 
	 * }
	 * 
	 * default void trying1() {
	 * 
	 * }
	 */
	
	
	

}
