package oops;

public class Employee {
	String name;
	int age;
	int empID;

	public static void main(String[] args) {
		Employee emp = new Employee("Vandna", 26, 101);
		Employee emp1 = new Employee("Raman", 28, 102);
		System.out.println(emp.name +" "+emp.age+" "+emp.empID);
		System.out.println(emp1.name +" "+emp1.age+" "+emp1.empID);

	}
	public Employee(String name, int age, int empID) {
		this.name = name;
		this.age = age;
		this.empID = empID;
	}

}
