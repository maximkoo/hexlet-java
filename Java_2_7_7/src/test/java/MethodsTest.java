import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MethodsTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //System.out.println(Arrays.toString(Methods.without(numbers, 2, 3))); // [1, 4, 5]
        assertArrayEquals(Methods.without(numbers, 2, 3), new int[]{1, 4, 5});

        int[] emptyNumbers = {};
        //Methods.without(emptyNumbers, 3, 4, 5); // []
        assertArrayEquals(Methods.without(emptyNumbers, 3, 4, 5), new int[]{}); // []


        int[] withDuplicateNumbers = {1, 2, 2, 2, 5};
        System.out.println(Arrays.toString(Methods.wrong3(withDuplicateNumbers,2)));

        System.out.println(Arrays.toString(Methods.without(withDuplicateNumbers, 2))); // [1, 5]
        assertArrayEquals(Methods.without(withDuplicateNumbers, 2), new int[]{1, 5}); // [1, 5]
    }
}
