import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int stepCount = scn.nextInt();
        int[] arr = new int[stepCount];
        int [] dp = new int[stepCount];
        for(int i=0; i<stepCount; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(getPaths(stepCount, 0, arr, dp));
    }

    public static int getPaths(int target, int curr, int[] step, int[] dp) {
        if(target < curr) { return 0;}
        if(target == curr) { return 1;}
        if(dp[curr] != 0) {
            return dp[curr];
        }

        int jump = step[curr];
        int sum = 0;
        for(int i = 1; i<= jump; i++) {
            sum+= getPaths(target, curr+i, step, dp);
        }

        dp[curr] = sum;
        return sum;
    }

}
