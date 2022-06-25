import java.util.*;
    
    public class Main{
      public static void divideNumber(int num) {
        if(num == 0){
          return;
        }
        divideNumber(num/10);
        System.out.println(num%10);
      }
    
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        divideNumber(num);
      }
    }
