package Java8;
import java.util.Optional;
public class OptionalClassExample2 {
         public static void main(String[] args) {
        	 Optional<String>emptyOption=Optional.empty();
        	 Optional<String>strOption=Optional.of("one");
        	 System.out.println(emptyOption.orElseGet(()->"optional nullorElseGet"));
        	 System.out.println(strOption.orElseGet(()->"optional value orElseGet"));
         }
}
