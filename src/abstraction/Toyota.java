package abstraction;

public class Toyota extends FlyingCar implements Car, ElectricCar { //Class can implements Interface but not abstract class

	//class can extends abstract class but not interface
	//here Toyota is a concrete class
	//only one extension (abstract class)
	//but multiple implements (interface) possible
	public void start() { //method implemented here
		System.out.println("We will use key to ignite the car");
		}
    public void stop() {
		System.out.println("We will use key to turn off the car");
	    }
    public void brake() {
		System.out.println("Our brake is mnaual");
		}
	public void autopilot() {
		System.out.println("This features is coming from flying car");
		
	}
	public void battery() {
		System.out.println("Battery is improving for Toyota but not improving much");
		
	}
	public void size() {
		System.out.println("The drone should be small in size to fly well");
		
	}
	public void shape() {
		System.out.println( "no square shape, speed will be down, need spherical shape");
		
	}

}
