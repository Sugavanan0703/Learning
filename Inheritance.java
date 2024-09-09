package Practice;
class Plane{
	public void takeoff() {
		System.out.println("Plane is taking off");
	}
	public void fly() {
		System.out.println("plane is flying");
	}
	public void land() {
		System.out.println("plane is landing");
	}
}
class CargoPlane extends Plane{
	
}
class FighterPlane extends Plane{
	
}
class PassengerPlane extends Plane{
	
}
public class Inheritance {
	public static void main(String[]args) {
	 CargoPlane cp = new CargoPlane();
	 FighterPlane fp = new FighterPlane();
	 PassengerPlane pp = new PassengerPlane();
	 cp.takeoff();
	 cp.fly();
	 cp.land();
	 fp.takeoff();
	 fp.fly();
	 fp.land();
	 pp.takeoff();
	 pp.fly();
	 pp.land();
	}
	
}
