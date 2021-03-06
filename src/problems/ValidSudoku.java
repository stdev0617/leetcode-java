package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Integer> []rows = new HashMap[9];
        HashMap<Integer, Integer> []cols = new HashMap[9];
        HashMap<Integer, Integer> []boxes = new HashMap[9];

        for(int i = 0; i<9;i++) {
            rows[i] = new HashMap<Integer, Integer>();
            cols[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char num = board[i][j];
                if(num != '.') {
                    int n = (int) num;
                    int box_index = (i/3)*3 + j/3;

                    rows[i].put(n, rows[i].getOrDefault(i, 0)+1);
                    cols[i].put(n, cols[i].getOrDefault(i, 0)+1);
                    boxes[box_index].put(n, boxes[box_index].getOrDefault(i, 0)+1);
                    if(rows[i].get(n) > 1 || cols[i].get(n) > 1 || boxes[box_index].get(n) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
