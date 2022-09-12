package Generics;

public class GenericsClass2 <T extends Number>{
	public void display() {
		System.out.println("This is a bounded type generics class");
	}

}
class Main73 {
	public static void main(String[] args) {
		GenericsClass2<String>obj= new GenericsClass2<>();
	}
}

