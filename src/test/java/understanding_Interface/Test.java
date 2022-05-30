package understanding_Interface;

public class Test {

	public static void main(String[] args) {
		
		User user = new User();
		user.launchurl();
		user.login();
		user.landingPageValidation();
		user.addtoCart();
		user.payment();
		user.logout();
		
		Shopping shopping = new User();
		shopping.launchurl();
		shopping.login();
		shopping.landingPageValidation();
		shopping.addtoCart();
		shopping.payment();
		shopping.logout();
		
		Shopping.tokenValidation();// in case you want to call the static method of interface, call it directly via the interface name

	}

}
