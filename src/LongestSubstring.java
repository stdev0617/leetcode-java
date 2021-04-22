public class LongestSubstring {
    private static int[] arr = new int[10001];
    public int longestSubstring(String s, int k) {
        return find(s, s.length()-1, k);
    }

    public int find(String substr, int end, int k) {
        int cnt = 0;
        int maxVal = -1;
        int[] mem = new int[26];
        for(int i = 0; i< end; i++){
            ++mem[substr.charAt(i)-'a'];
        }
        for(int i = end; i >= 0; --i) {
            if(mem[substr.charAt(i)-'a'] < k) {
                maxVal = Math.max(maxVal, cnt);
                return Math.max(find(substr,end-1, cnt), maxVal);
            } else {
                cnt++;
            }
        }
        return maxVal;
    }
}
