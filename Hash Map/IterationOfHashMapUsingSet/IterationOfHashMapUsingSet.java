import java.util.HashMap;
import java.util.Set;

class IterationOfHashMapUsingSet {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 200);
        map.put("china", 400);
        map.put("pak", 800);
        map.put("odisa", 900);

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println("key => " + k + ", value => " + map.get(k));
        }
    }
}
