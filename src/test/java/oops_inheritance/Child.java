package oops_inheritance;

public class Child extends Parent{//IS - a relationship
	//what can't be inherited - Private method, Constructor
	//types of inheritance - Single; Multi level; Hierarchical( not use in java)
	
	public static void main(String[]args) {
		Child child = new Child();
		child.sportsbike();
		child.guitar();
		child.bunglow();
		child.farmland();
		child.haveli();
		child.vintageCar();
		
		Parent parent = new Parent();
		parent.bunglow();
		parent.farmland();
		parent.haveli();
		parent.vintageCar();
		
		
	}
	
	public void sportsbike() {
		System.out.println("Child's sportsbike");
	}
	public void guitar() {
		System.out.println("Child's guitar");
	}

	
		

	}


