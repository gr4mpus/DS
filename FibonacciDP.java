import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] dp = new int[num+1];
        System.out.println(fibonacci(num, dp));
    }

    public static int fibonacci(int n, int[] dp) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(dp[n] != 0) {
            return dp[n];
        }

        int res = fibonacci(n-1, dp) + fibonacci(n-2, dp);
        dp[n] = res;
        return res;
    }

}
