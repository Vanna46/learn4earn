package oops_polymorphism;

public class CT_StaticPoly {
	//static polymorphism, Compile polymorphism
	//1. It can be achieved by Method Overloading
	//2. name of the method should be same
	//   class should be same
	//   different arguments/parameters
	//3. It is handled by the Compiler
	//===========RunTime/dynamic polymorphism==============
	//1. has to have Inheritance
	//2. achieved by Method Overriding
	//3. Method name should be same
	//   Class should be different
	//   same args/params
	//4. It is handled by JVM
	

	public static void main(String[] args) {
		CT_StaticPoly objref = new CT_StaticPoly();
		objref.show();
		objref.show(1, 20, 30);
		objref.show("Vandna", "Sodhi");
		objref.show("Raman");
		objref.show(new StringBuffer("Buffer"));
		objref.show(objref);
		

	}
	public void show() {
		System.out.println("This is a simple method with no parameters");
	}
	public void show(int i) {
		System.out.println("This is a simple method with 1 parameters");
	}
	public void show(int i, int j) {
		System.out.println("This is a simple method with 2 parameters");
	}
	public void show(int i, int j, int k) {
		System.out.println("This is a simple method with 3 parameters");
	}
	public void show(String S) {
		System.out.println("This is a simple method with String Type parameters");
	}
	public void show(String S, String V) {
		System.out.println("This is a simple method with 2 String type parameters");
	}
	public void show(StringBuffer S2) {
		System.out.println("This is a StringBuffer method");
	}
	public Object show(Object obj) {
		System.out.println("This is Object class");
		return null;
	}

}
