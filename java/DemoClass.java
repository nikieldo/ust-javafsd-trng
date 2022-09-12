package Generics;
class Main63 {
	public static void main(String[] args) {
		DemoClass demo=new DemoClass();
		demo.<String>genericsMethod("Java Programming");
		demo.<Integer>genericsMethod(25);
	}
}

public class DemoClass {
	public<T>void genericsMethod(T data)  {
		System.out.println("generics Method:");
		System.out.println("data passed:" +data);
	}

}
