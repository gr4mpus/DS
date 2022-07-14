import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int [][]arr = new int[size][size];
        printNQueens(arr, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(chess.length == row) {
            System.out.println(qsf+".");
            return;
        }

        int maxCol = chess.length-1;
        int maxRow = chess.length-1;
        
        for(int col = 0; col <= maxCol; col++) {
            boolean rowFlag = true;
            boolean diagFlag = true;
            for(int curRow = 0; curRow < maxRow; curRow++) {
                if(chess[curRow][col] == 1) {
                    rowFlag = false;
                }
                
            }

            int rightUpRow = row;
            int rightUpCol = col;
            while(rightUpRow >= 0 && rightUpCol <= maxCol) {
                if(chess[rightUpRow][rightUpCol] == 1) {
                    diagFlag = false;
                }
                rightUpRow--;
                rightUpCol++;
            }

            int rightDownRow = row;
            int rightDownCol = col;
            while(rightDownRow <= maxRow && rightDownCol <= maxCol) {
                if(chess[rightDownRow][rightDownCol] == 1) {
                    diagFlag = false;
                }
                rightDownRow++;
                rightDownCol++;
            }

            int leftUpRow = row;
            int leftUpCol = col;
            while(leftUpRow >= 0 && leftUpCol >= 0) {
                if(chess[leftUpRow][leftUpCol] == 1) {
                    diagFlag = false;
                }
                leftUpRow--;
                leftUpCol--;
            }

            int leftDownRow = row;
            int leftDownCol = col;
            while(leftDownRow <= maxRow && leftDownCol >= 0){
                if(chess[leftDownRow][leftDownCol] == 1){
                    diagFlag = false;
                }
                leftDownRow++;
                leftDownCol--;
            }

            if(rowFlag && diagFlag) {
                chess[row][col] = 1;
                printNQueens(chess, qsf+row+"-"+col+", ", row+1);
                chess[row][col] = 0;
            }
        }
    }
}
