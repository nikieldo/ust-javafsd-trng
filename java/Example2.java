package Collectors;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Example2 {
   public static void main(String[] args) {
	   List<Student>studentlist=new ArrayList<Student>();
	   studentlist.add(new Student(11,"jon",22));
	   studentlist.add(new Student(22,"Steve",20));
	   studentlist.add(new Student(33,"Lucy",23));
	   studentlist.add(new Student(44,"Sansa",22));
	   studentlist.add(new Student(55,"Maggie",24));
	   List<String>names=studentlist.stream()
			   .map(n->n.name)
			   .collect(Collectors.toList());
	   System.out.println(names);
	   
   }
}
