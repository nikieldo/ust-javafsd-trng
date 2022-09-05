package this_prgms;

public class Animal2 { 

	public void display() {
		System.out.println("i am an animal");
	}
}
class Dog2 extends Animal {
	public void display() {
		System.out.println("i am a dog");
	}
	public void printMessage() {
		display();
		super.display();
	}
}
class Main66 {
	public static void main(String [] args) {
		Dog2 dog1=new Dog2();
		dog1.printMessage();
	}

}
