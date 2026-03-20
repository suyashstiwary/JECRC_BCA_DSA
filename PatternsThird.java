import java.util.*;
public class Patterns_third {
    public static void main(String[] args) {
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0)System.out.print(0);
        //         else System.out.print(1);
        //     }
        //     System.out.println("");
        // }/
        int n=7;
        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<=i;j++)System.out.print("*");
            }
            else{
                
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        for(int i=1;i<=n;i++){
            if(i<=n/2){
                for(int j=1;j<i;j++)System.out.print(" ");
                for(int j=1;j<=i;j++)System.out.print("*");
            }
            else{
                for(int j=1;j<n-i+1;j++)System.out.print(" ");
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
