package hashMap;import java.util.HashMap;import java.util.Map;public class HowHashMapWorks1 {    public static void main(String[] args){        Map<String,Integer> map = new HashMap<>(); // default capacity is 16        // it will create 16 buckets (nodes - linnkedlist)        // Each node have 4 fields - key, hash, value, next hash of the next element in the same position        //        map.put("aaa",1);        map.put("bbb",2);        map.put("ccc",3);        // put break point after putting one element and see the buckets        // Now put some values with same hash        String s1 = "FB";        String s2 = "ea";        map.put(s1,111);        map.put("s2",222);        // now s1 and s2 hashcode will be same and how it's behave        // after debugging at the end of the program        // this is known as hash colision        System.out.println(map.get(s1));        System.out.println(map.get(s2));    }}