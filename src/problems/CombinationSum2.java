package problems;

import java.util.*;
import java.util.stream.Collectors;

public class CombinationSum2 {
    private void combination(int[] candidates, int target, int curVal, LinkedList<Integer> comb, List<List<Integer>> resultList, int[] mem) {
        int candidateSize = candidates.length;
        if(curVal == target) {
            resultList.add(new ArrayList<>(comb.stream().sorted().collect(Collectors.toList())));
            return;
        }
        for (int i = 0; i < candidateSize; i++){
            if(mem[i] == 1) continue;
            if(curVal+candidates[i] > target) {
                break;
            }
            comb.addLast(candidates[i]);
            mem[i] = 1;
            combination(candidates, target, curVal+candidates[i], comb, resultList, mem);
            mem[i] = 0;
            comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] mem = new int[candidates.length];
        LinkedList<Integer> comb = new LinkedList<>();
        List<List<Integer>> resultList = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < candidates.length; i++){
            sum+=candidates[i];
        }
        if(sum < target) {
            return resultList;
        }
        if(sum == target) {
            List<Integer> list = new ArrayList<Integer>(Arrays.stream(candidates).boxed().collect(Collectors.toList()));
            resultList.add(list);
            return resultList;
        }
        Arrays.sort(candidates);
        combination(candidates, target, 0, comb, resultList, mem);
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
