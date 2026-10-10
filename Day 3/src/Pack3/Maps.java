package Pack3;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Tamanna");
        map.put(102, "Rahul");
        map.put(103, "Priya");

        System.out.println("Complete Map: " + map);

        System.out.println("Student 102: " + map.get(102));

        map.put(102, "Aman");
        System.out.println("After Update: " + map);

        map.remove(103);
        System.out.println("After Removal: " + map);

        System.out.println("Contains key 101: " + map.containsKey(101));

        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}