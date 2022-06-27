import java.util.*;

public class Main{
public static boolean isPrime(int num) {
  int primeCheck = 2;
  while(num >= primeCheck*primeCheck) {
    if(num%primeCheck == 0){
      return false;
    }
    primeCheck++;
  }
  return true;
}

public static void main(String[] args) {
  Scanner scn = new Scanner(System.in);
  int num = scn.nextInt();
  int div = 2;
  while(num >= div) {
    if(num%div == 0 && isPrime(div)){
      System.out.print(div+" ");
      num = num/div;
    }else {
      div++;
    }
  } 
 }
}
