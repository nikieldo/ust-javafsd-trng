package this_prgms;

public class Animal {
	public void display() {
		System.out.println("i am an animal");
	}
}
class Dog extends Animal {
	public void display() {
		System.out.println(" i am a dog");
	}
	public void printMessage() {
		display();
	}
}
class Main77 {
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.printMessage();
	}

}
