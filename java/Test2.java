package abstract_prgms;

public class Test2 {
	int a;
	int b;
	Test2()
	{
		a=10;
		b=20;
	}
	Test2 get()
	{
		return this;
	}
	void display()
	{
		System.out.println("a=" +a+"b=" +b);
	}
	public static void main(String[] args)
	{
		Test2 object=new Test2();
		object.get().display();
	}

}
