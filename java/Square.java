package abstract_prgms;
interface Polygon1 {
	void getArea();
	default void getSides() {
		System.out.println("i can get sides of a polygon");
	}
}
class Rectangle1 implements Polygon1 {
	public void getArea() {
		int length=6;
		int breadth=5;
		int area=length* breadth;
		System.out.println("the area of the rectangle is" +area);
	
}
	public void getSides() {
		System.out.println("i have 4 sides");
	}
}

class Square implements Polygon1 {
	public void getArea() {
		int length=5;
		int area= length* length;
		System.out.println("the area of square is" + area);
	}
}
class Main72 {
	public static void main(String [] args) {
		Rectangle1 r1=new Rectangle1();
		r1.getArea();
		r1.getSides();
		Square s1=new Square();
		s1.getArea();
		s1.getSides();
		Square s11 = new Square();
		s11.getArea();
		s11.getSides();
	}
	

}
