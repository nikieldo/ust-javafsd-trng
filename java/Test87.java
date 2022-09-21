package Java8;

public class Test87 {
	public static void main(String args[])
	{
		new Thread(()-> {
			System.out.println("new thread created");
		}).start();
	}

}
