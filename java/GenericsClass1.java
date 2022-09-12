package Generics;
class Main {
	public static void main(String[] args) {
		GenericsClass1<Integer>intObj=new GenericsClass1<>(5);
		System.out.println("Generic Class returns:" +intObj.getData());
		GenericsClass1<String>stringObj=new GenericsClass1<>("Java Programming");
		System.out.println("Generic Class returns" +intObj.getData());
		GenericsClass1<String>stringObj1=new GenericsClass1<>("Java Programming");
		System.out.println("Generic Class returns:" +stringObj1.getData());
	}
		
	
}

public class GenericsClass1 <T> {
       private T data;
       public GenericsClass1(T data) {
    	   this.data=data;
       }
	public T getData() {
		return this.data;

	}

}
