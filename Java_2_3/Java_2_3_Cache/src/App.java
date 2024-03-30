public class App
{
    public static void main(String[] args) {
        // Создаем кэш с максимальной емкостью в 2 элемента
//        var cache = new Cache(2);
//
//        // Добавляем туда два запроса
//        cache.put("praesent", "imperdiet et commodo vulputate");
//        cache.put("amet erat", "in tempus sit amet");
//
//        // Обращаемся к кэшу и получаем из него ответы на запросы
//        System.out.println(cache.get("praesent")); // imperdiet et commodo vulputate
//        System.out.println(cache.get("amet erat")); // in tempus sit amet
//        System.out.println(cache.get("some request")); // null
//
//        // Добавляем в кэш третий элемент
//        cache.put("justo sit", "auctor sed tristique in");
//
//        cache.get("justo sit"); // auctor sed tristique in
//        System.out.println(cache.get("amet erat")); // in tempus sit amet
//
//        // Так как емкость кеша равна 2, самый старый запрос должен быть удален
//        System.out.println(cache.get("praesent")); // null
        var cache = new Cache(2);

        cache.put("praesent", "imperdiet et commodo vulputate");
        cache.put("amet erat", "in tempus sit amet");

        //assertThat(cache.get("praesent")).isEqualTo("imperdiet et commodo vulputate");
        System.out.println(cache.get("praesent"));
        //assertThat(cache.get("amet erat")).isEqualTo("in tempus sit amet");
        System.out.println(cache.get("amet erat"));
        cache.put("justo sit", "auctor sed tristique in");

        //assertThat(cache.get("justo sit")).isEqualTo("auctor sed tristique in");
        System.out.println(cache.get("justo sit"));
        //assertThat(cache.get("amet erat")).isEqualTo("in tempus sit amet");
        System.out.println(cache.get("amet erat"));
        //assertThat(cache.get("praesent")).isNull();
        System.out.println(cache.get("praesent"));

        cache.put("sed", "vel ipsum praesent blandit");

        //assertThat(cache.get("sed")).isEqualTo("vel ipsum praesent blandit");
        System.out.println(cache.get("sed"));
        //assertThat(cache.get("justo sit")).isEqualTo("auctor sed tristique in");
        System.out.println(cache.get("justo sit"));
        //assertThat(cache.get("amet erat")).isNull();
        System.out.println(cache.get("amet erat"));

        cache.put("sed", "another value");

        //assertThat(cache.get("sed")).isEqualTo("another value");
        System.out.println(cache.get("sed"));
        //assertThat(cache.get("justo sit")).isEqualTo("auctor sed tristique in");
        System.out.println(cache.get("justo sit"));

        //assertThat(cache.get("not exists")).isNull();
        System.out.println(cache.get("not exists"));
    }

}
