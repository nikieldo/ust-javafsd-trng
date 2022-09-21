package Java8;
interface TestInterface
{
	public void square(int a);
	default void show()
	{
		System.out.println("default method executed");
	}
}
class TestClass implements TestInterface
{
      public void square(int a)
      {
    	  System.out.println(a*a);
      }
      public static void main(String args[])
      {
    	  TestClass d=new TestClass();
    	  d.square(4);
    	  d.show();
      }
}
