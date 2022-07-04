import java.io.*;
import java.util.*;

public class Main{

public static int[] getArray(int length, Scanner scn) {
    int arr[] = new int[length];
    for(int i=0; i<length; i++) {
        arr[i] = scn.nextInt();
    }
    return arr;
}

public static void printArr(int[] arr) {
    for(int i=0; i<arr.length;i++) {
        System.out.println(arr[i]);
    }

}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int arr1Size = scn.nextInt();
    int[] arr1 = getArray(arr1Size, scn);
    int arr2Size = scn.nextInt();
    int[] arr2 = getArray(arr2Size, scn);
    int resSize = 0;
    int carry = 0;
    int[] temp;
    if(arr1Size > arr2Size) {
        resSize = arr1Size;
        temp = arr1;
    }else {
        resSize = arr2Size;
        temp = arr2;
    }
    int[] res = new int[resSize];
    int endCounter = 1;
    while(arr1Size-endCounter>=0 && arr2Size-endCounter>=0) {
        int sum = arr1[arr1Size-endCounter]+arr2[arr2Size-endCounter]+carry;
        carry = sum/10;
        res[resSize-endCounter] = sum%10;
        endCounter++;
    }

    while(temp.length-endCounter >=0){
        int sum = temp[temp.length-endCounter]+carry;
        carry = sum/10;
        res[temp.length-endCounter] = sum%10;
        endCounter++;
    }
    if(carry>0) {
        System.out.println(carry);
    }
    printArr(res);
    
 }

}
