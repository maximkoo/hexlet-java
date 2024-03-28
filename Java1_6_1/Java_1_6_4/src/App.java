public class App {
    public static String checkSecurity(Url url) {
        String host = url.getHost();
        String res = "";
        if (url.getProtocol().equals("https")) {
            res = "Connection to " + host + " is secure";
        } else if (url.getProtocol().equals("http")) {
            res = "Connection to " + host + " is not secure";
        }
        return res;
    }

    public static void main(String[] args) {
        var url1 = new Url("https://google.com");
        System.out.println(checkSecurity(url1));
        var url2 = new Url("http://example.com");
        System.out.println(checkSecurity(url2));
    }
}
