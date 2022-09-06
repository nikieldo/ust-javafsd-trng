package abstract_prgms;
interface Polygon {
	void getArea(int length,int breadth);
}
public class Rectangle implements Polygon {
	public void getArea(int length,int breadth) {
		System.out.println("The area of rectangle is" +(length * breadth));
	}

}
class Main64 {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.getArea(5, 6);
	}
}
