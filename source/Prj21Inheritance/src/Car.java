
public class Car extends Machine {

	
	
	public void wipeWindShield() {
		System.out.println("Wiping Windshield");
	}
	
	
	//@Override = Adds validation to make sure this method is overriden
	@Override
	public void stop() {
		// Super calls the parent method of stop 
		//super.stop();
		
		System.out.println("Car Stopped...");
	}



	// Overriding start method from parent class.
	@Override
	public void start() {
		System.out.println("Car started.");
	}
	
	
	public void showInfo() {
		// Not able to access name because it is declared private in the Machine class
		// private variables can only be accessed by the class they are created in. 
		System.out.println("Car name: " + name);
	}
}
