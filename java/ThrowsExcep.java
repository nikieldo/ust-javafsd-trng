package Day4;

public class ThrowsExcep {
	static void fun() throws IllegalAccessException
	{
		System.out.println("insidefun()");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
		try
		{
			fun();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main");
		}
	}

}
