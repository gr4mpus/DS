import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int arrSize = scn.nextInt();
    int []arr = new int[arrSize];
    int maxValue = Integer.MIN_VALUE;
    for(int i=0; i<arrSize; i++) {
        arr[i] = scn.nextInt();
        if(arr[i] > maxValue) {
            maxValue = arr[i];
        }
    }

    // Works only for positive integers

    for(int i=maxValue; i>0; i--){
        for(int j=0; j<arrSize; j++){
            if(arr[j]>=i){
                System.out.print("*\t");
            }else {
                System.out.print("\t");
            }
        }
        System.out.println("");
    }
 }

}
