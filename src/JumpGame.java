public class JumpGame {
    private static boolean result = false;
    public static boolean jump(int[] nums, int offset) {
        int numSize = nums.length-1;
        if(offset == numSize) {
            result = true;
        } else{
            for(int i = 0; i < nums[offset]; i++) {
                jump(nums, offset+nums[offset]-i);
            }
        }
        return result;
    }
    public boolean canJump(int[] nums) {
        // my answer
//        return jump(nums, 0);

        // solution
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}
