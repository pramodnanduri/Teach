import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        //HashMap. Without generics.
        Map map = new HashMap();
        map.put("a", 1);
        map.put("b", "cd");
        map.put(32, "ad");

        Map<String, Integer> genericMap = new HashMap<>();
        genericMap.put("a", 2);
        genericMap.put("b", 3);

        System.out.println(genericMap.get("a")); //2
        genericMap.size();

        //Java 8.
        //Specifying default value.
        genericMap.getOrDefault("c", 4);

        //Map Iteration.
        //1. Get Key Set.
        //2. Iterate Key set and get Value for that key.
        //Method 1:
        for (String s : genericMap.keySet()) {
            System.out.println("Key:" + s + "Value:" + genericMap.get(s));
        }

        //Method 2:
        for (Map.Entry<String, Integer> entry : genericMap.entrySet()) {
            System.out.println("Key:" + entry.getKey() + "Value:" + entry.getValue());
        }

        //Method 3:
        Iterator<String> iterator = genericMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("Key:" + key + " Value " + genericMap.get(key));
        }

        //Remove/Delete
        genericMap.remove("a");
        //Contains Key: O(1)
        genericMap.containsKey("a");
        //Contains Value : O(n).
        genericMap.containsValue(2);
        //Get Value List: Will give list of all values.
        genericMap.values();

    }

}
