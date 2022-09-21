package Java8;
import java.util.Optional;
public class OptionalClassExample3 {
	public static void main(String[] args) {
   	 Optional<String>strOptional=Optional.of("onetwothree");
   	 Optional<String>strOptional1=strOptional.map(String::toLowerCase);
   	 strOptional1.ifPresent(System.out::println);

}
}
