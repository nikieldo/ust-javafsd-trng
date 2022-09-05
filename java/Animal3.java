package this_prgms;

public class Animal3 {
      protected String type="animal";
}
class Dog3 extends Animal3 {
	public String type="mammal";
	public void printType() {
		System.out.println("i am a" +type);
		System.out.println("i am an" +super.type);
	}
}
class Main99 {
	public static void main(String[] args) {
		Dog3 dog1=new Dog3();
		dog1.printType();
	}
}
