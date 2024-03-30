import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println(isBracketsBalanced("()")); // true
        System.out.println(isBracketsBalanced("()()")); // true
        System.out.println(isBracketsBalanced("(()())")); // true
        System.out.println(isBracketsBalanced("(")); // false
        System.out.println(isBracketsBalanced("(()")); // false
        System.out.println(isBracketsBalanced(")(")); // false
        System.out.println();
        System.out.println(isBracketsBalanced("(()"));
        System.out.println(isBracketsBalanced("())"));
        System.out.println(isBracketsBalanced(")("));
        System.out.println(isBracketsBalanced("(()()"));
    }

    public static boolean isBracketsBalanced(String str) {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                list.add(String.valueOf(str.charAt(i)));
            } else if (str.charAt(i) == ')') {
                if (list.isEmpty()) {
                    return false;
                }
                list.removeLast();
            }
        }
        return list.isEmpty();
    }
}
