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
