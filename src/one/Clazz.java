package one;

import java.util.stream.Stream;

/**
 * Created by ildar on 20.03.14.
 */
public class Clazz {

    public static void main(String[] args) {

        Long result = Stream.iterate(0L, val -> val++).limit(1000).filter(in -> in % 3 == 0 || in % 5 == 0).reduce(0L, (accumulator, val) -> accumulator + val);

        System.out.println(result);
    }
}
