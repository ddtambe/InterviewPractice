package Collections;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Initial List: "+list);

        list.set(2, 50);
        System.out.println("Set Method set 50 at index 2: "+list);

        System.out.println("Max element: "+ Collections.max(list));
        System.out.println("Min element: "+ Collections.min(list));

        System.out.println("Contains Method: "+list.contains(10));

        System.out.println("To 2Array: "+ Arrays.toString(list.toArray()));

        System.out.println("Iterator");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
