import java.io.*;
import java.util.*;

public class Main{

public static int[] createArray(int size, Scanner scn) {
    int arr[] = new int[size];
    for(int i=0; i<size; i++){
        arr[i] = scn.nextInt();
    }
    return arr;
}

public static void displayArr(int[] arr){
    boolean isFirstZero = true;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==0 && isFirstZero){
            isFirstZero = false;
            continue;
        }
        isFirstZero = false;
        System.out.println(arr[i]);
    }
}

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] a1 = createArray(n1, scn);
    int n2 = scn.nextInt();
    int[] a2 = createArray(n2, scn);
    int[] res = new int[n2];
    int a1Counter = n1-1;
    int a2Counter = n2-1;
    int resCounter = n2-1;
    boolean carry = false;
    while(a1Counter >= 0 && a2Counter >=0) {
        int num;
        if(carry){
            if(a2[a2Counter] <= a1[a1Counter]){
                num = 10+a2[a2Counter]-a1[a1Counter]-1;
                carry = true;
            }else {
                num = a2[a2Counter]-a1[a1Counter]-1;
                carry = false;
            }
        } else {
            if(a2[a2Counter] >= a1[a1Counter]){
                num = a2[a2Counter] - a1[a1Counter];
            }else {
                carry = true;
                num = 10 + a2[a2Counter] - a1[a1Counter];
            }
            
        }
        res[resCounter] = num;
        a1Counter--;
        a2Counter--;
        resCounter--;
    }
    while(a2Counter >= 0){
        int num;
        if(carry){
            if(a2[a2Counter]==0){
                num = 9;
                carry = true;
            }else {
                num = a2[a2Counter]-1;
                carry = false;
            }
        }else {
            num = a2[a2Counter];
        }
        res[resCounter] = num;
        a2Counter--;
        resCounter--;

    }

    displayArr(res);

 }

}
