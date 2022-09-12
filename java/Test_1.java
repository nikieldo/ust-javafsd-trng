package Generics;

public class Test_1 {
	T obj1;
	U obj2;
	Test_1(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
class Main65 {
	public static void main(String[] args)
	{
		Test_1<String,Integer>obj=new Test_1<String,Integer>("GfG",15);
		obj.print();
	}
}
