//Getting used to syntax
import java.util.*;

public class HashmapImplementation {

    public static void main(String[] args) {
        //        HashMap<Integer, String> map = new HashMap<>();
        //        // to add value
        //        map.put(1, "void");
        //        map.put(2, "void-hr");
        //
        //        System.out.println(map);

        // to retrieve using key
        //        String yeBhaiNaamApka = map.get(2);
        //        System.out.println(yeBhaiNaamApka);

        // to iterate over keys
        //        Set<Integer> keys = map.keySet();
        //        for (int key : keys) {
        //            System.out.println(key);
        //        }

        // iterating over key value pair
        //        Set<Map.Entry<Integer, String>> keyValueSet = map.entrySet();
        //        for (Map.Entry<Integer, String> keyValuePair : keyValueSet) {
        //            System.out.println(keyValuePair);
        //        }

        //        now problem statement is in given array count each value repeated how many times
        //        eg: [1,2,2,1,3,2,3,1]
        //        1 -> 3
        //        2 -> 3
        //        3 -> 2

        //        approach -> traverse an array
        //        check map if item not present add it
        //        if present update value by one

        //        with using inbuilt function like computeIfPresent or putIfAbsent
        //                HashMap<Integer,Integer> freqMap = new HashMap<>();
        //                int[] numbericArray = {1, 2, 2, 1, 3, 2, 3, 1};
        //                for (int i = 0; i <numbericArray.length; i++) {
        //                    freqMap.computeIfPresent(numbericArray[i], (key, val ) -> val += 1);
        //                    freqMap.putIfAbsent(numbericArray[i], 1);
        //                }
        //
        //                System.out.println(freqMap);

        //     without using inbuilt function
        int[] numericArray = {1, 2, 2, 1, 3, 2, 3, 1};
        HashMap<Integer,Integer> freqMap = new HashMap<>();

        for (int j : numericArray) {
            if (freqMap.containsKey(j)) {
                freqMap.put(j, freqMap.get(j) + 1);
            } else {
                freqMap.put(j, 1);
            }
        }

        System.out.println(freqMap);

    }
}
