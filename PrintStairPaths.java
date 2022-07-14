import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int steps = scn.nextInt();
        printStairPaths(steps, "");
    }

    public static void printStairPaths(int n, String path) {
        if(n == 0) {
            System.out.println(path);
            return;
        }

        // for 1
        if(n >= 1) {
            printStairPaths(n-1, path+"1");
        }
        
        // for 2
        if(n >= 2) {
            printStairPaths(n-2, path+"2");
        }

        // for 3
        if(n >= 3) {
            printStairPaths(n-3, path+"3");
        }
    }

}
