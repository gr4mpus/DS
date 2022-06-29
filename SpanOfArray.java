import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int numCount = scn.nextInt();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<numCount; i++) {
        int inpNum = scn.nextInt();
        if(inpNum > max) {
            max = inpNum;
        }

        if(inpNum < min) {
            min = inpNum;
        }
    }

    System.out.println(max-min);
 }

}
