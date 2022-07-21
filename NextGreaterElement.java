import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
  //  Loop implementation
  //  int size = arr.length;
  //  int[] res = new int[size];
  //  for(int i = 0; i< size; i++) {
  //    int j = i+1;
  //    while(j<size) {
  //      if(arr[j] > arr[i]) {
  //        break;
  //      }
  //      j++;
  //    }

  //    if(j == size) {
  //      res[i] = -1;
  //    } else {
  //      res[i] = arr[j];
  //    }
  //  }

  //  return res;

  // Stack implementation

  int size = arr.length;
  int[] res = new int[size];
  res[size-1] = -1;
  Stack<Integer> stack = new Stack<Integer>();
  stack.push(arr[size-1]);
  for(int i = size-2; i >= 0; i--) {
    while(!stack.empty() && stack.peek() <= arr[i]) {
      stack.pop();
    }

    if(stack.empty()) {
      res[i] = -1;
    } else {
      res[i] = stack.peek();
    }
    stack.push(arr[i]);
  }

  return res;
 }

}
