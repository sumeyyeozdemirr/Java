package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer s?meyye = new Customer(1,"S?meyye","?zdemir");
		customerManager.add(s?meyye);

	}

}
