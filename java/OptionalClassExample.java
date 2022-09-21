package Java8;
import java.util.Optional;
public class OptionalClassExample {
	public static void main(String[] args) {
		Optional<Object>objOptional=Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());
		Optional<String>strOptional=Optional.ofNullable("one");
		System.out.println(strOptional.isPresent());
	}

}
