import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        int[][] dp = new int[row][col];
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println(getMinCost(0, 0, row-1, col-1, arr, dp));


    }

    public static int getMinCost(int cr, int cc, int tr, int tc, int[][]arr, int[][]dp) {
        if(cr > tr || cc > tc) {
            return Integer.MAX_VALUE;
        }

        if(cr == tr && cc == tc) {
            return arr[cr][cc];
        }

        if(dp[cr][cc] != 0) {
            return dp[cr][cc];
        }

        // horizontal
        int hCost = getMinCost(cr, cc+1, tr, tc, arr, dp);

        // vertical
        int vCost = getMinCost(cr+1, cc, tr, tc, arr, dp);

        int minCost = Math.min(hCost, vCost) + arr[cr][cc];
        dp[cr][cc] = minCost;
        return minCost;
    }

}
