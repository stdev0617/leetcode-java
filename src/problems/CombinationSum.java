package problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum {
    private void combination(int[] candidates, int target, int curVal, List<Integer> comb, List<List<Integer>> resultList) {
        int candidateSize = candidates.length;
        if(curVal == target) {
            resultList.add(new ArrayList<>(comb.stream().sorted().collect(Collectors.toList())));
            return;
        } else if(curVal > target) {
            return;
        }
        for (int i = 0; i < candidateSize; i++){
            comb.add(candidates[i]);
            combination(candidates, target, curVal+candidates[i], comb, resultList);
            comb.remove(comb.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> comb = new ArrayList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        combination(candidates, target, 0, comb, resultList);
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
