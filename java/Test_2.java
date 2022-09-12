package Generics;

public class Test_2 <T> {
	T obj;
	Test_2(T obj) { this.obj=obj; }
	public T getObject() {return this.obj; }

}
class Main27 {
	public static void main(String[] args)
	{
		Test_2<Integer>iObj=new Test_2<Integer>(15);
		System.out.println(iObj.getObject());
		Test_2<String>sObj=new Test_2<String>("geeksforgeeks");
		System.out.println(sObj.getObject());
		iObj=sObj;
	}
}
