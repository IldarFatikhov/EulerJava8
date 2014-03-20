package two;

import java.util.stream.Stream;

/**
 * Created by ildar on 20.03.14.
 */
public class Clazz {

    public static void main(String[] args) {

        Stream.iterate(1L, val -> val++).limit(5).map(Clazz::fibonacci).forEach(System.out::println);

//        Long result = Stream.iterate(0L, val -> val++).parallel().limit(10).map(Clazz::fibonacci).filter(val -> val % 2 == 0).reduce(0L, (accumulator, val) -> accumulator + val);
//
//        System.out.print(result);
    }

    public static Long fibonacci(Long x) {
        if (x == 0 || x == 1 || x == 2)
            return x;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
}
