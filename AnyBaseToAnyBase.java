import java.util.*;
  
  public class Main{

  public static int changeBase(int num, int srcBase, int destBase) {
    int res = 0;
    int powerCount = 0;
    while(num!=0){
      int rem = num%destBase;
      res+= rem*(int)Math.pow(srcBase, powerCount);
      powerCount++;
      num = num/destBase;
    }
    return res;
  }
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int destBase= scn.nextInt();
      // First Change it to base 10
      int base10Value = changeBase(n, sourceBase, 10);
      // Then change it to destination base
      int resultBaseValue = changeBase(base10Value, 10, destBase);

      System.out.println(resultBaseValue);
   }   
  }

