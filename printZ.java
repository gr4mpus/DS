import java.util.*;

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            System.out.print("*");
        }
        System.out.println("");
        for(int i=4; i>1; i--){
            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        

        for(int i=1; i<=5; i++){
            System.out.print("*");
        }

    }
}
