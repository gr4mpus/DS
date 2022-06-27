import java.util.*;
  
  public class Main {

	  public static boolean isTriplet(int num1, int num2, int num3) {
		  return num1*num1 == num2*num2 + num3*num3;
	  }
  
  	  public static void main(String[] args) {
  	  	Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max = 0;
		if(a>b){
			if(a>c){
				System.out.println(isTriplet(a,b,c));
			}else {
				System.out.println(isTriplet(c,a,b));
			}
		}else {
			if(b>c){
				System.out.println(isTriplet(b,a,c));
			}else {
				System.out.println(isTriplet(c,a,b));
			}
		}
  	  }
  }
