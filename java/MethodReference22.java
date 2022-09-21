package Java8;
interface Sayable1{
	void say();
}
public class MethodReference22 {
	public static void saySomething() {
		System.out.println("hello,this is static method");
	}
	public static void main(String[] args) {
		Sayable1 sayable=MethodReference22::saySomething;
		sayable.say();
	}

}
