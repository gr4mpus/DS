import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int amt = scn.nextInt();
        System.out.println(getCombination(0, arr, 0, amt));
    }

    public static int getCombination(int index, int[] arr, int sum, int target) {
        if(sum > target){
            return 0;
        }

        if(sum == target) {
            return 1;
        }
        int count = 0;
        for(int i= index; i<arr.length; i++) {
            count+= getCombination(i, arr, sum+arr[i], target);
        }

        return count;
    }
}
