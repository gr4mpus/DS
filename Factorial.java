import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 1 || n== 2){
            return n;
        }

        return n*factorial(n-1);
    }

}
