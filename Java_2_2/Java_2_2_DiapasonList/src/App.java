import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var ranges1 = summaryRanges(new ArrayList<Integer>());
        System.out.println(ranges1); // => []

        var ranges2 = summaryRanges(List.of(1));
        System.out.println(ranges2); // []

        var ranges3 = summaryRanges(List.of(1, 2, 3));
        System.out.println(ranges3); // [1->3]

        var ranges4 = summaryRanges(List.of(0, 1, 2, 4, 5, 7));
        System.out.println(ranges4); // [0->2, 4->5]

        var ranges5 = summaryRanges(List.of(110, 111, 112, 111, -5, -4, -2, -3, -4, -5));
        System.out.println(ranges5); // [110->112, -5->-4]
    }

    public static List<String> summaryRanges(List<Integer> list) {
        List<String> arr = new ArrayList<String>();
        if (list.isEmpty()) {
            return arr;
        }
        int start = list.get(0);
        int len = 0;
        String str = "";
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == 1 + list.get(i - 1)) {
                str = "" + start + "->" + list.get(i);
                len++;
            } else {
                if (len > 0) {
                    arr.add(str);
                }
                start = list.get(i);
                len = 0;
                str = "";
            }
        }
        if (len > 0) {
            arr.add(str);
        }
        return arr;
    }
}
