import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int input = scn.nextInt();
  int divCount = 1;
  int res = 0;
  while(input != 0){
    int rem = input%10;
    input = input/10;
    res+=divCount*(int)Math.pow(10, rem-1);
    divCount++;
  } 
  System.out.println(res);
 }
}
