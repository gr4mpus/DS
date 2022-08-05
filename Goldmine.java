import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        int[][] dp = new int[row][col];
        for(int i = 0; i<row; i++){
            for(int j=0; j<col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<row; i++) {
            int rowRes = getMaxGold(i, 0, row-1, col-1, arr, dp);
            if(rowRes > max){
                max = rowRes;
            }
        }

        System.out.println(max);
    }

    public static int getMaxGold(int cr, int cc, int mr, int mc, int[][] arr, int[][] dp){
        if(cr < 0 || cr > mr){
            return Integer.MIN_VALUE;
        }

        if(cc == mc && cr >= 0 && cr <= mr) {
            return arr[cr][cc];
        }

        if(dp[cr][cc] != 0) {
            return dp[cr][cc];
        }

        int d1 = getMaxGold(cr-1, cc+1, mr, mc, arr, dp);
        int d2 = getMaxGold(cr, cc+1, mr, mc, arr, dp);
        int d3 = getMaxGold(cr+1, cc+1, mr, mc, arr, dp);

        int res = Math.max(d1, Math.max(d2, d3));
        dp[cr][cc] = arr[cr][cc]+res;
        return dp[cr][cc];
    }

}
