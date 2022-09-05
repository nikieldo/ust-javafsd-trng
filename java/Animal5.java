package this_prgms;

public class Animal5 {
	Animal5(String type) {
		System.out.println("Type:" +type);
	}
 }
class Dog5 extends Animal5 {
	Dog5() {
		super("Animal5");
		System.out.println("i am dog");
	}
}
class Main59 {
	public static void main(String[] args) {
		Dog5 dog1=new Dog5();
	}
	
}
