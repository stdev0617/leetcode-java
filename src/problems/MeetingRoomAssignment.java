package problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomAssignment {
    static int result = 0;
    public int getMaxCount(int[][] meeting) {
        return assign(meeting, 0,1);
    }
    public int assign(int[][] meeting, int offset, int maxValue) {
        Arrays.sort(meeting, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]) {
                    return Integer.compare(o1[0],o2[0]);
                }
                return Integer.compare(o1[1],o2[1]);
            }
        });
        if(offset == meeting.length-1){
            result = Math.max(result, maxValue);
        }
        int end = meeting[offset][1];
        for(int i = offset+1; i < meeting.length; i++) {
            if(meeting[i][0] >= end) {
                assign(meeting, i,maxValue+1);
            }
        }
        return result;
    }
}
