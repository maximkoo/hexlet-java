import java.util.Iterator;
import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {
        var params = new LinkedHashMap<String, String>();
        params.put("page", "1");
        params.put("per", "10");

        bqs(params); // "page=1&per=10"
    }

    public static void bqs(LinkedHashMap<String, String> params) {
        Iterator it = params.entrySet().iterator();
        String str = "";

        while (it.hasNext()) {
            str += it.next();
            if (it.hasNext()) {
                str += "&";
            }
        }
        System.out.println(str);
    }
}
