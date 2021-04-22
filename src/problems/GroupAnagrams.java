package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> map = new HashMap<>();
        for(String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca); // ca.toString();으로 하면 에러
//            System.out.println("valueOf: " + String.valueOf(ca));
//            System.out.println("toString(): " + ca.toString()); // toString을 쓰면 주소값이 나온다. 즉, ca의 리스트니까... 그냥은 스트링변환이 안됨.
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values()); // 리턴할때,<> 없이 줄 수 있다. 즉, 값을 하나만 줄 때, 타입 안적어줘도됨.
    }
}
