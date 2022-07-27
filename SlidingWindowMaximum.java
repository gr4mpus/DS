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
    int k = Integer.parseInt(br.readLine());

    // code
    Stack<Integer> stack = new Stack<Integer>();
    int[] max = new int[n];
    max[n-1] = -1;
    stack.push(n-1);

    for(int i = n-2; i>=0; i--) {
       while(!stack.empty() && a[stack.peek()] <= a[i]) {
          stack.pop();
       }

       if(stack.empty()) {
          max[i] = -1;
       } else {
          max[i] = stack.peek();
       }

       stack.push(i);
    }

    for(int i = 0; i<= n-k; i++) {
       int j = i;
       while(j < i+k) {
          if(max[j] == -1) {
             System.out.println(a[j]);
             break;
          }
          if(max[j] < i+k) {
             j = max[j];
          } else {
             System.out.println(a[j]);
          }
       }
    }
 }
}
