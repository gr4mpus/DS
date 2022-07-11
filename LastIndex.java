import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        System.out.println(lastIndex(a, 0, target));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length) {
            return -1;
        }

        int recRes = lastIndex(arr, idx+1, x);
        if(recRes != -1) {
            return recRes;
        } else {
            if(arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }
    }

}
