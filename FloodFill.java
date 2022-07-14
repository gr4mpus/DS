import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        int maxRow = maze.length-1;
        int maxCol = maze[0].length-1;
        if(sr == maxRow && sc == maxCol) {
            System.out.println(asf);
            return;
        }

        // top
        if(sr-1 >= 0 && maze[sr-1][sc] == 0) {
            maze[sr-1][sc] = 1;
            floodfill(maze, sr-1, sc, asf+"t");
            maze[sr-1][sc] = 0;
        }

        // left
        if(sc-1 >= 0 && maze[sr][sc-1] == 0) {
            maze[sr][sc-1] = 1;
            floodfill(maze, sr, sc-1, asf+"l");
            maze[sr][sc-1] = 0;
        }

        // down
        if(sr+1 <= maxRow && maze[sr+1][sc] == 0) {
            maze[sr+1][sc] = 1;
            floodfill(maze, sr+1, sc, asf+"d");
            maze[sr+1][sc] = 0;
        }

        // right
        if(sc+1 <= maxCol && maze[sr][sc+1] == 0) {
            maze[sr][sc+1] = 1;
            floodfill(maze, sr, sc+1, asf+"r");
            maze[sr][sc+1] = 0;
        }

    }
}
