package Java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatChat {
    public static void main(String[] args) {

        String name = "Deepak Singh";

        Map<Integer, Long> firstRepChar = name.toLowerCase().chars()
                .filter(c -> c != ' ')
                .boxed().collect(Collectors
                        .groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        firstRepChar.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .findFirst()
                .ifPresent(e -> System.out.println((char) e.getKey().intValue()));
    }
}
