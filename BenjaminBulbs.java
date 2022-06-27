import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int count = 1;
        while(num >= count*count) {
            System.out.println(count*count);
            count++;
        } 
    }
  }
