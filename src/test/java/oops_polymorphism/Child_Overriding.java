package oops_polymorphism;

public class Child_Overriding extends Parent_MethodOverriding{

	public static void main(String[] args) {
		Child_Overriding child = new Child_Overriding();
		child.help();
		
		Parent_MethodOverriding parent = new Parent_MethodOverriding();
		parent.help();
		
		Parent_MethodOverriding parent1 = new Child_Overriding();
		parent1.help();
	
		
		

	}
	public void help() {
		System.out.println("This is child's help method trying to learn concept of Method Overriding");
	}

}
