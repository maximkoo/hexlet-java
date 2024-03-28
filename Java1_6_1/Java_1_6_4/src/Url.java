public class Url {
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String str;

    public Url(String str) {
        this.str = str;
    }

    public String getProtocol() {
        return str.substring(0, str.indexOf("://"));
    }

    public String getHost() {
        return str.substring(3 + str.indexOf("://"));
    }
}
