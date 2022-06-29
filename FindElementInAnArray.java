import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int arrSize = scn.nextInt();
    int arr[] = new int[arrSize];
    for(int i=0; i<arrSize; i++) {
        arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();
    int targetIndex = -1;
    for(int i=0; i<arrSize; i++){
        if(arr[i] == target){
            targetIndex = i;
        }
    }

    System.out.println(targetIndex);
 }

}
