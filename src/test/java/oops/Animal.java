package oops;

public class Animal {
	
	String color;
	int age;

	public static void main(String[] args) {
		
		barking();
		Animal.barking();
		
		Animal romeo = new Animal();
		//nomencleture of object reference == some portion of class name
		romeo.sleeping();
		romeo.guarding();
		
		romeo.color = "black";
		romeo.age = 4;
		System.out.println(romeo.color +" "+ romeo.age);
		romeo.initializeromeo("fawn", 1);
		
		Birds birds = new Birds();
		birds.chirping();
		birds.flying();
		
		Vehicles vehicle = new Vehicles();
		vehicle.brakesApplied();
		vehicle.engineStarts();

	}
	
	public void initializeromeo(String c, int a) {
		color = c;
		age = a;
		System.out.println(color +" "+ age);
	}
	
	public static void barking() {
		System.out.println("Romeo hardly barks");
	}
	public static void sleeping() {
		System.out.println("Romeo sleeps all the time");
	}
	public static void guarding() {
		System.out.println("Romeo guards the house");
	}
}
	
	class Birds{
		public void flying() {
			System.out.println("Birds Fly");
		}
		public void chirping() {
			System.out.println("Birds Chirp");
		}
	}
class Vehicles {
	public void engineStarts() {
		System.out.println("Engine Starts");
	}
	public void brakesApplied() {
		System.out.println("Brakes Applied");
	}
}



