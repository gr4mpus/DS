import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        String first = str.substring(0,1);
        String rest = str.substring(1);
        printSS(rest, ans+first);
        printSS(rest, ans);
    }

}
