import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printEncodings(str,"");

    }

    public static void printEncodings(String str, String asf) {
        int strSize = str.length();
        if(strSize == 0) {
            System.out.println(asf);
            return;
        }

        // for first
        int first = str.charAt(0) - '0';
        if(first != 0) {
            printEncodings(str.substring(1), asf+Character.toString((char)first+96));
        }else {
            if(asf.length() == 0) {
                System.out.println("Invalid input. A string starting with 0 will not be passed.");
            }
            return;
        }
        
        // for first two
        if(strSize > 1){
            int firstTwo = Integer.parseInt(str.substring(0,2));
            if(firstTwo > 10) {
                if(firstTwo < 27) {
                    printEncodings(str.substring(2), asf+Character.toString((char)firstTwo+96));
                }
            } else {
                System.out.println("No output possible. But such a string maybe passed. In this case print nothing.");
                return;
            }

        }
    }

}
