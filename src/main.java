import javaTest.Compare;
import javaTest.IteratorTest;
import problems.MeetingRoomAssignment;
import problems.letterCombinations;
import problems.CombinationSum;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        int[] input = {2,3,6,7};
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result =combinationSum.combinationSum(input, 8);
        for(int i = 0; i < result.size(); i++) {
            for(int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j)+ " ");
            }
            System.out.println("");
        }

    }
}
