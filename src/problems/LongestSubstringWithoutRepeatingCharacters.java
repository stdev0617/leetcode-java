package problems;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) {
            return 0;
        }
        StringBuilder temp = new StringBuilder();
        int result = 1;
//        for(int i = 0; i<s.length();i++){
//            if(temp.toString().contains(String.valueOf(s.charAt(i)))) {
//                result = Math.max(result, temp.length());
//                temp.setLength(0);
//            }
//            temp.append(s.charAt(i));
//            if(i == s.length()-1) {
//                result = Math.max(result, temp.length());
//            }
//        }
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(temp.toString().contains(String.valueOf(s.charAt(j)))) {
                    result = Math.max(result, temp.length());
                    temp.setLength(0);
                }
                temp.append(s.charAt(j));
                if(j == s.length()-1) {
                    result = Math.max(result, temp.length());
                }
            }
        }
        return result;
    }
}
