import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        System.out.println(getMazePaths(0, 0, row-1, col-1));
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

        ArrayList result = new ArrayList<String>();

        for(int colInc = 1; colInc+sc <= dc; colInc++) {
            ArrayList<String> colRecRes = getMazePaths(sr, sc+colInc, dr, dc);
            for(String colRes: colRecRes) {
                result.add("h"+colInc+colRes);
            }
        }

        for(int rowInc = 1; rowInc+sr <= dr; rowInc++) {
            ArrayList<String> rowRecRes = getMazePaths(sr+rowInc, sc, dr, dc);
            for(String rowRes: rowRecRes) {
                result.add("v"+rowInc+rowRes);
            }
        }

        for(int diaInc = 1; sr+diaInc <= dr && sc+diaInc <= dc; diaInc++) {
            ArrayList<String> diaRecRes = getMazePaths(sr+diaInc, sc+diaInc, dr, dc);
            for(String diaRes: diaRecRes) {
                result.add("d"+diaInc+diaRes);
            }
        }

        return result;
    }

}
