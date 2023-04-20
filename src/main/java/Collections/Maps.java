package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String  str = "devendra";
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map);
        System.out.println(map.containsKey('d'));
        System.out.println(map.get('d'));
        System.out.println(map.containsValue(1));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("Iterating");
        Set<Character> set = map.keySet();
        for(char ch : set){
            System.out.println("Key: "+ch+" Value: "+map.get(ch));
        }

        System.out.println("Entry Set");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
