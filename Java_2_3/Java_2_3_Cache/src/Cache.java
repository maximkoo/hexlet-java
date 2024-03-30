import java.util.Iterator;
import java.util.LinkedHashMap;

public class Cache {
    private LinkedHashMap<String, String> cache = new LinkedHashMap<>();

    public int getSize() {
        return size;
    }

    private int size;

    public Cache(int size) {
        this.size = size;
    }

    public void put(String key, String val) {
        if (cache.size() == this.size && !cache.containsKey(key)) {
            Iterator<String> it = cache.keySet().iterator();
            String keyToBeRemoved = it.next();
            cache.remove(keyToBeRemoved);
        }
        cache.put(key, val);
    }

    public String get(String key) {
        if (!cache.containsKey(key)) {
            return null;
        }
        return cache.get(key);
    }
}
