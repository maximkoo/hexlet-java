import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        String content =
                "[foo:bar]\n" +
                        "environment=\"X_FORWARDED_var1=111\"\n" +
                        "\n" +
                        "[bar:baz]\n" +
                        "environment=\"key2=true,X_FORWARDED_var2=123\"\n" +
                        "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
                        "\n" +
                        "[baz:foo]\n" +
                        "key3=\"value3\"\n" +
                        "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
                        "\n" +
                        "[program:prepare]\n" +
                        "environment=\"key5=value5,X_FORWARDED_var3=value,key6=value6\"\n" +
                        "\n" +
                        "[program:start]\n" +
                        "environment=\"pwd=/temp,user=tirion\"\n" +
                        "\n" +
                        "[program:options]\n" +
                        "environment=\"X_FORWARDED_mail=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en\"\n" +
                        "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'\n" +
                        "\n" +
                        "[empty]\n" +
                        "command=\"X_FORWARDED_HOME=/ cd ~\"";
        var result = App.getForwardedVariables(content);
        System.out.println(result);
    }

    public static String getForwardedVariables2(String content) {
        String xf = "X_FORWARDED";
        List<String> res = new ArrayList<>();
        List<String> list = new ArrayList<String>(Arrays.asList(content.split("\n")));
        //System.out.println(list.size());
        //List<String> env = list.stream().filter(x->x.startsWith("environment")).map(x->x.substring(1+x.indexOf("\""), x.lastIndexOf("\""))).toList();
        //for (String s : env) {
        //    System.out.println(s);
        //}
        String joined = list.stream().filter(x -> x.startsWith("environment")).map(x -> x.substring(1 + x.indexOf("\""), x.lastIndexOf("\""))).collect(Collectors.joining(","));
        //System.out.println(joined);
        List<String> params = new ArrayList<String>(Arrays.asList(joined.split(",")));
//        Map<String, String> paramValues = params.stream().collect(Collectors.toMap(x -> x.substring(0, x.indexOf("=")), x -> x.substring(1 + x.indexOf("="))));
//        for (String s : paramValues.keySet()) {
//            if (s.startsWith(xf)) {
//                res.add(s.substring(1 + xf.length()) + "=" + paramValues.get(s));
//            }
//        }
        params = params.stream().filter(x -> x.startsWith(xf)).toList();
        for (String param : params) {
            res.add(param.substring(1 + xf.length()));
        }
        return String.join(",", res);
    }

    public static String getForwardedVariables(String content) {
        String xf = "X_FORWARDED_";
        return new ArrayList<String>(List.of(Arrays.asList(content.split("\n"))
                .stream()
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.substring(1 + x.indexOf("\""), x.lastIndexOf("\"")))
                .collect(Collectors.joining(","))
                .split(",")))
                .stream()
                .filter(x -> x.startsWith(xf))
                .map(x -> x.substring(xf.length()))
                .collect(Collectors.joining(","));
    }
}
