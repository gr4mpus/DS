import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

   //  Brute
    int maxRange = 0;
    for(int i = 0; i<n; i++) {
       if(a[i] > maxRange) {
          maxRange = a[i];
       }
    }

    int max = 0;
    int sum = 0;

    for(int i = 1; i <= maxRange; i++) {
       for(int j = 0; j < n; j++) {
          if(a[j] >= i) {
             sum+= i;
             if(sum > max) {
                max = sum;
             }
          } else {
             sum = 0;
          }
       }
       sum = 0;
    }

    System.out.println(max);
 }
}
