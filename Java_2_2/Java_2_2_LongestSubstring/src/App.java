import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        //System.out.println(getLongestLength("abcdeef")); // 5
        //System.out.println(getLongestLength("jabjcdel")); // 7
        System.out.println(getLongestLength("")); // 0

    }

    public static int getLongestLength(String str) {
        int maxLen = 0;
        int curLen = 0;
        int start = 0;
        Set<Character> used = new HashSet<>();
        //
        while (start < str.length()) {
            curLen = 0;
            for (int i = start; i < str.length(); i++) {
                if (!used.contains(str.charAt(i))) {
                    used.add(str.charAt(i));
                    curLen++;
                } else {
                    break;
                }
            }
            maxLen = curLen > maxLen ? curLen : maxLen;
            used = new HashSet<Character>();
            start++;
        }
        return maxLen;
    }
}
