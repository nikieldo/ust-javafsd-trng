package Enum;
enum Size1 {
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

public class Test000 {
	Size pizzaSize;
	public Test000(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("i ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("i ordered a medium size pizza");
			break;
		default:
			System.out.println("i don't know which one to order");
			break;
		}
	}
}
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test000 t1=new Test000(Size.MEDIUM);
		t1.orderPizza();

	}

}
