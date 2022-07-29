import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] dp = new int[num];
        System.out.println(countStairs(0, num, dp));
    }

    public static int countStairs(int n, int target, int[] dp) {
        if(n > target) {
            return 0;
        }

        if(n == target) {
            return 1;
        }

        if(dp[n] != 0) {
            return dp[n];
        }

        int res = countStairs(n+1, target, dp) + countStairs(n+2, target, dp) + countStairs(n+3, target, dp);
        dp[n] = res;
        return res;
    }


}
