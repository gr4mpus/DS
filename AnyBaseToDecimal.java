import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int powerCount = 0;
      int res = 0;
      while(n!=0) {
         int rem = n%10;
         res+= rem*(int)Math.pow(b, powerCount);
         powerCount++;
         n=n/10;
      }

      return res;
   }
  }
