import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class Methods {
    private static String implementation = "right";

    private static int[] right(int[] numbers, int... values) {
        var numbersWithoutValues = ArrayUtils.clone(numbers);
        for (var value : values) {
            numbersWithoutValues = ArrayUtils.removeAllOccurrences(numbersWithoutValues, value);
        }
        return numbersWithoutValues;
    }

    private static int[] wrong1(int[] numbers, int... values) {
        return ArrayUtils.removeElements(numbers, values);
    }

    private static int[] wrong2(int[] numbers, int... values) {
        if (ArrayUtils.isEmpty(numbers)) {
            return null;
        }
        return right(numbers, values);
    }

    public static int[] wrong3(int[] numbers, int... values) {
        var size = numbers.length;
        var indexFrom = size == 0 ? 0 : 1;
        var indexTo = size - 1 <= indexFrom ? indexFrom : size - 1;
        var numbersIncomplete = Arrays.copyOfRange(numbers, indexFrom, indexTo);
        var numbersWithoutValues = right(numbersIncomplete, values);
        if (size != 0) {
            numbersWithoutValues = ArrayUtils.addFirst(numbersWithoutValues, numbers[0]);
            numbersWithoutValues = ArrayUtils.add(numbersWithoutValues, numbers[size - 1]);
        }
        return numbersWithoutValues;
    }

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static int[] without(int[] numbers, int... values) {
        return switch (implementation) {
            case "wrong1" -> wrong1(numbers, values);
            case "wrong2" -> wrong2(numbers, values);
            case "wrong3" -> wrong3(numbers, values);
            default -> right(numbers, values);
        };
    }
}
