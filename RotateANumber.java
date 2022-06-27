// SOLUTION 1: Converting Number to String - SLOWER 
import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     int rotation = scn.nextInt();
      String str = String.valueOf(num);
      rotation = rotation%str.length();
      if(rotation<0){
       rotation = str.length()+rotation;
      }
      int firstLimit = str.length() - rotation;
      String firstSubstring = str.substring(0, firstLimit);
      String secondSubstring = str.substring(firstLimit);
      String res = secondSubstring+firstSubstring;
      System.out.println(Integer.parseInt(res));
    }
   }
// SOLUTION 2: Using Number - FASTER 
// import java.util.*;
   
//    public class Main{
   
//    public static void main(String[] args) {
//      Scanner scn = new Scanner(System.in);
//      int num = scn.nextInt();
//      int rotation = scn.nextInt();
//      int digitCount = 0;
//      int temp = num;
//      while(temp!=0){
//        temp = temp/10;
//        digitCount++;
//      }
//      rotation = rotation%digitCount;
//      if(rotation<0){
//        rotation = digitCount+rotation;
//      }
//      int div = (int)Math.pow(10, rotation);
//      int firstHalf = num/div;
//      int secondHalf = num%div;
//      secondHalf = secondHalf*(int)Math.pow(10, digitCount-rotation);
//      System.out.println(secondHalf+firstHalf);
//     }
//    }
