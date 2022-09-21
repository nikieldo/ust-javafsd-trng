package Java8;

public class Java8_Tester {
	public static void main(String args[]) {
		Vehicle vehicle=new Car();
		vehicle.print();
	}

}
interface Vehicle {
	default void print() {
		System.out.println("i am a vehicle!");
	}
	static void blowHorn() {
		System.out.println("blowing horn!!!");
	}
}
interface FourWheeler {
	default void print() {
		System.out.println("i am a four wheeler!");
	}
}
class Car implements Vehicle,FourWheeler {
	public void print() {
		Vehicle.super.print();
			FourWheeler.super.print();
			Vehicle.blowHorn();
			System.out.println("i am a car!");
		}
}

