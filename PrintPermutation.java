import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        int strSize = str.length();
        if(strSize == 1) {
            System.out.println(asf+str);
            return;
        }

        for(int charCount=0; charCount<strSize; charCount++) {
            String remString = str.substring(0,charCount)+str.substring(charCount+1);
            printPermutations(remString, asf+str.charAt(charCount));
        }
    }

}
