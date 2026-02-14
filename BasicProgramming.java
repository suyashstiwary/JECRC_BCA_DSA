import java.util.*;

public class BasicProgramming {
    public static Boolean isPrime(int num){
        Boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0)flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        // To print the prime from 1 to n
        // if(num==1)System.out.println("Neither Prime nor Composite");
        // for(int i=2;i<=num;i++){
        //     if(isPrime(i))System.out.println(i);
        // }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}