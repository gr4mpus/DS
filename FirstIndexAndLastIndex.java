import java.io.*;
import java.util.*;

public class Main{

public static int findIndex(int []arr, int start, int end, int n) {
    if(start == end) {
        if(arr[start] == n) {
            return start;
        } else {
            return -1;
        }
    }

    int mid = (start + end)/2;
    if(arr[mid] == n) {
        return mid;
    } else {
        if(n> arr[mid]) {
            return findIndex(arr, mid+1, end, n);
        }else {
            return findIndex(arr, start, mid, n);
        }
    }
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
        arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();
    int targetIndex = findIndex(arr, 0, n-1, target);
    if(targetIndex == -1) {
        System.out.println(-1+"\n"+-1);
        return;
    }
    int firstIndex = targetIndex;
    int lastIndex = targetIndex;
    boolean firstFlag = true;
    boolean lastFlag = true;
    while(firstFlag || lastFlag) {
        if(firstIndex>=0 && arr[firstIndex-1] == target) {
            firstIndex--;
        } else {
            firstFlag = false;
        }
        if(lastIndex < n && arr[lastIndex+1] == target) {
            lastIndex++;
        } else {
            lastFlag = false;
        }    
    }

    System.out.println(firstIndex+"\n"+lastIndex);
 }

}
