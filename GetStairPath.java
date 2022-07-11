import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(getStairPaths(num));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0) {
            ArrayList res = new ArrayList<String>();
            res.add("");
            return res;
        }
        ArrayList result = new ArrayList<String> ();
        for(int i=1; i<=3; i++) {
            if(n-i >= 0) {
                ArrayList recRes = getStairPaths(n-i);
                int recResSize = recRes.size();
                for(int counter = 0; counter<recResSize; counter++) {
                    result.add(String.valueOf(i)+recRes.get(counter));
                }
            }
        }

        return result;
    }

}
