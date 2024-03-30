import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "world")); // true
        System.out.println(scrabble("avj", "java")); // false
        System.out.println(scrabble("avjafff", "java")); // true
        System.out.println(scrabble("", "hexlet")); // false
        System.out.println(scrabble("scriptingjava", "JavaScript")); // true
    }

    public static boolean scrabble(String letters, String str) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(letters.split("")));
        for (int i = 0; i < str.length(); i++) {
            String s1 = String.valueOf(str.charAt(i)).toLowerCase();
            String s2 = String.valueOf(str.charAt(i)).toUpperCase();
            int idx = list.indexOf(s1);
            if (idx == -1) {
                idx = list.indexOf(s2);
            }
            if (idx == -1) {
                return false;
            } else {
                list.remove(idx);
            }
        }
        return true;
    }
}
