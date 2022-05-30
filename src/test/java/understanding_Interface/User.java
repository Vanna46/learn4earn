package understanding_Interface;

public class User implements Shopping {
	
	public static void tokenID() {
		System.out.println("User's personal tokenID");
	}

	@Override
	public void launchurl() {
		System.out.println("launchurl is a method inherited from interface");
		
	}

	@Override
	public void login() {
		System.out.println("login is a method inherited from interface");
		
	}

	@Override
	public void landingPageValidation() {
		System.out.println("landingPageValidation is a method inherited from interface");
		
	}

	@Override
	public void selectItem() {
		System.out.println("selectItem is a method inherited from interface");
		
	}

	@Override
	public void addtoCart() {
		System.out.println("addtoCart is a method inherited from interface");
		
	}

	@Override
	public void payment() {
		System.out.println("payment is a method inherited from interface");
		
	}

	@Override
	public void logout() {
		System.out.println("logout is a method inherited from interface");
		
	}

}
