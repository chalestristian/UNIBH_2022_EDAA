import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class SantanderCoder {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6)
                .filter(el -> el % 2 == 0)

                .map(Integer::sum)



                .ifPresent(el -> System.out.printf("The result is: %d.%n", el));    }

}
