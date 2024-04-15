import java.util.ArrayList;
import java.util.List;

public class ListUtils<T> {
    public List<T> merge(List<T> list1, List<T> list2) {
        List<T> list = new ArrayList<>(list1);
        list.addAll(list2);
        return list;
    }
}
