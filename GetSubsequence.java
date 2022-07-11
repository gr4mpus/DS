import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(gss(str));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0) {
            ArrayList res = new ArrayList<String> ();
            res.add("");
            return res;
        }

        String first = str.substring(0,1);
        String remString = str.substring(1);
        ArrayList recRes = gss(remString);
        int recResSize = recRes.size();
        for(int i=0; i<recResSize; i++) {
            recRes.add(first+recRes.get(i));
        }
        return recRes;
    }

}
