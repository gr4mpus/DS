import java.io.*;
import java.util.*;

public class Main{

public static int[] getBinary(int num, int size) {
      int []arr = new int[size];
      int index = size-1;
      while(num != 0) {
         int rem = num%2;
         num = num/2;
         arr[index] = rem;
         index--;
      }
      return arr;
}

public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
   
   int numberCount = (int)Math.pow(2, n);
    for(int i=0; i<numberCount; i++) {
       int [] binary = getBinary(i, n);
       for(int j=0; j<n; j++) {
          if(binary[j] == 0) {
             System.out.print("-\t");
          }else {
             System.out.print(arr[j]+"\t");
          }
       }

       System.out.println();
    }

    
 }

}
