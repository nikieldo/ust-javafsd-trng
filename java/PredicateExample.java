package Collectors;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(14));
		System.out.println("Number 18 is ODD:"+checkOddEven.test(14));
		System.out.println("Number 14 is EVEN:"+checkOddEven.test(14));
		
	}

}
