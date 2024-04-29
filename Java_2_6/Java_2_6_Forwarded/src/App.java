public class App {
    public static void main(String[] args) {
        String content =
                "[program:prepare]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make prepare'\n" +
                "autorestart=false\n" +
                "environment=\"X_FORWARDED_MAIL=tirion@google.com,X_FORWARDED_HOME=/home/tirion,language=en\"\n" +
                "\n" +
                "[program:http_server]\n" +
                "command=sudo -HEu tirion /bin/bash -c 'cd /usr/src/app && make environment'\n" +
                "environment=\"key5=value5,X_FORWARDED_var3=value,key6=value6\"";
        var result = App.getForwardedVariables(content);
        System.out.println(result);
    }

    public static String getForwardedVariables(String content){
        return "trololo";
    }
}
