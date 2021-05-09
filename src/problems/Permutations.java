package problems;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class Permutations {
    static List<List<Integer>> resultList = new ArrayList<>();
    public void getPermutation(List<Integer> list, List<Integer> result) {
//        System.out.println("새로 들어왔어");
//        for (int j = 0; j<list.size();j++) {
//            System.out.print(list.get(j)+",");
//        }
//        System.out.println("이번꺼 끝");
        int tmp; 
        if(list.size() == 1) {
            result.add(list.get(0));
            resultList.add(result);
            return;
        } else {
            for (int i = 0; i < list.size(); i++) {
                result.add(list.get(0));
                tmp = list.get(0);
                list.remove(0);
                getPermutation(list, result);
                list.add(tmp);
                result.remove(result.size() - 1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            list.add(nums[i]);
        }
        getPermutation(list, result);
        return resultList;
    }
}
