import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int arrSize = scn.nextInt();
    int []arr = new int[arrSize];
    for(int i=0; i<arrSize; i++){
        arr[i] = scn.nextInt();
    }
    for(int i=0; i<arrSize; i++){
        for(int j=i; j<arrSize; j++){
            for(int k=i; k<=j; k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}
