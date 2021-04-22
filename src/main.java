import javaTest.Compare;
import javaTest.IteratorTest;
import javafx.util.Pair;
import problems.MeetingRoomAssignment;
import problems.letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
<<<<<<< HEAD
        int[] nums = {3, 2, 1, 0, 4};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(nums));
        int[] nums2 = {2, 3, 1, 1, 4};
//        System.out.println(jumpGame.canJump(nums2));

    }
=======
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        GroupAnagrams ga = new GroupAnagrams();
//        ga.groupAnagrams(strs);
//        IteratorTest iter = new IteratorTest();
//        iter.iteratorTest();

//        String digits = "2";
//        letterCombinations lc = new letterCombinations();
//        lc.letterCombinations(digits);

//        Compare comp = new Compare();
//        comp.comparePlayers();

        int[][] meeting = {{1,4},{3,5},{0,6},{5,7},{3,8},{5,9},{6,10},{8,11},{8,12},{2,13},{12,14} };
        MeetingRoomAssignment mra = new MeetingRoomAssignment();
        System.out.println(mra.getMaxCount(meeting));


     }
>>>>>>> d43c634df8ae6797e1bc323a1b0d7c7c3c49e9d2
}
