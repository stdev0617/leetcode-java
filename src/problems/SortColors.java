package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public int[] sortColors(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == null) {
                map.put(nums[i],1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < map.get(i); i++) {
                result[idx] = i;
                idx++;
            }
        }

        return result;
    }
}
