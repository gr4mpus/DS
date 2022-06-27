import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();
      int div = 2;
      int gcd = 1;
      int lcm = 1;
      while(num1/2 >= div && num2/2 >= div) {
        if(num1%div == 0 && num2%div == 0){
          num1 = num1/div;
          num2 = num2/div;
          gcd = gcd*div;
        }else {
          div++;
        }
      }
      lcm = gcd * num1 * num2;
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }
