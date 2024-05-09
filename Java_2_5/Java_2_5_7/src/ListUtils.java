import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class ListUtils {

    // BEGIN (write your solution here)
    public static <T> List<T> filter(List<T> list, Predicate<T> pre) {
        List<T> res = new ArrayList<T>();
        for (T li : list) {
            if (pre.test(li)) {
                res.add(li);
            }
        }
        return res;
    }
    // END
}
