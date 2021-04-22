package problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class letterCombinations {
    public static final String[] KEYS = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        combination("",digits,0,list);
        return list;
    }

    public void combination(String prefix, String digits, int offset, List<String> list){
        if(digits.length() <= offset) {
            list.add(prefix);
            return;
        }
        String str = KEYS[digits.charAt(offset)-'0'];
        for(int i = 0; i<str.length();i++){
            combination(prefix+str.charAt(i),digits,offset+1,list);
        }
    }
}
