import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        System.out.println(getMazePaths(0 ,0, row-1, col-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc) {
            ArrayList res = new ArrayList<String>();
            res.add("");
            return res;
        }
        ArrayList result = new ArrayList<String> ();
        if(sc < dc) {
            ArrayList resCol = getMazePaths(sr, sc+1, dr, dc);
            int resColSize = resCol.size();
            for(int counter = 0; counter< resColSize; counter++) {
                result.add("h"+resCol.get(counter));
            }
        }

        if(sr < dr) {
            ArrayList resRow = getMazePaths(sr+1, sc, dr, dc);
            int resRowSize = resRow.size();
            for(int counter = 0; counter<resRowSize; counter++) {
                result.add("v"+resRow.get(counter));
            }
        }

        return result;
    }

}
