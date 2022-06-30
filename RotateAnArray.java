// Naive
import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    int diff = k%a.length;
    if(k<0) {
      diff = a.length+diff;
    }
    int tempArr[] = new int[diff];
    int tempIndex = 0;
    int diffIndex = a.length-diff;
    while(diffIndex<a.length) {
      tempArr[tempIndex] = a[diffIndex];
      diffIndex++;
      tempIndex++;
    }
    for(int i=a.length-diff-1; i>=0; i--){
      a[i+diff] = a[i];
    }
    for(int i=0; i<tempIndex; i++) {
      a[i] = tempArr[i];
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
