import javaTest.Compare;
import javaTest.IteratorTest;
import javafx.util.Pair;
import problems.MeetingRoomAssignment;
import problems.letterCombinations;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
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
}
