package Java8;
interface Drawable {
	public void draw();
}
public class LambdaExpression_example2 { 
	public static void main(String[] args) {
		int width=10;
		Drawable d2=()->{
			System.out.println("drawing"+width);
		};
		d2.draw();
	}

}
