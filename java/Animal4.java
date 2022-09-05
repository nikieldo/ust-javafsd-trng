package this_prgms;

public class Animal4 {
	Animal4() {
		System.out.println("i am an animal");
	}
}
class Dog4 extends Animal4 {
	Dog4() {
		super();
		System.out.println("i am a dog");
	}
}
class Main22 {
	public static void main(String[] args) {
		Dog4 dog1 =new Dog4();
	}

}
