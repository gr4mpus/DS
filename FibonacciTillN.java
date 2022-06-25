import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      if(n>=1){
        System.out.println(0);
      }
      if(n >=2){
        System.out.println(1);
      }
      int a = 0;
      int b = 1;
      for(int i=2; i<n; i++){
        int c = a+b;
        a = b;
        b = c;
        System.out.println(c);
      }

   }
  }
