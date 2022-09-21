package Java8;

public class InstanceMethodReference2 {
	public void printnMsg() {
		System.out.println("hello,this is instance method");
		
	}
	public static void main(String[] args) {
		Thread t2=new Thread(new InstanceMethodReference2()::printnMsg);
		t2.start();
	}

}
