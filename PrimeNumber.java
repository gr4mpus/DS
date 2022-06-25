import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int count = scn.nextInt();
      int arr[] = new int[count];
      for(int i=0; i<count; i++){
        arr[i] = scn.nextInt();
      }

      for(int index=0; index<count; index++) {
        boolean isPrime = true;
        for(int i=2; i*i<= arr[index]; i++){
          if(arr[index]%i == 0) {
            isPrime = false;
            break;
          }
        }
        if(isPrime) {
          System.out.println("prime");
        }else {
          System.out.println("not prime");
        }
      }
      
  
   }
  }
