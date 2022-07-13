import java.io.*;
import java.util.*;

public class Main {

    static String[] key = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String inp = scn.nextLine();
        printKPC(inp, "");
    }

    public static void printKPC(String str, String asf) {
        if(str.length() == 0) {
            System.out.println(asf);
            return;
        }

        int first = str.charAt(0) - '0';
        String rest = str.substring(1);
        String charSet = key[first];
        int charSetSize = charSet.length();
        for(int i=0; i<charSetSize; i++) {
            printKPC(rest, asf+charSet.charAt(i));
        }
    }

}
