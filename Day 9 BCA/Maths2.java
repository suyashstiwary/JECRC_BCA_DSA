import java.util.Scanner;

public class Maths2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        // Q1 Palindrome number
        // int num=n;
        // int rev=0;
        // while(num>0){
        //     int rem=num%10;
        //     rev=rev*10+rem;
        //     num=num/10;
        // }
        // if(n==rev)System.out.println("true");
        // else System.out.println("false");

        // Q2 Largest digit
        // int num=n;
        // int ans=0;
        // while(num>0){
        //     int curr_digit=num%10;
        //     if(curr_digit>ans)ans=curr_digit;
        //     num/=10;
        // }
        // System.out.println(ans);

        // Q3 Prime numbers
        // int num=n;
        // Boolean isPrime_num = true;
        // for(int i=2;i*i<=num;i++){
        //     if(num%i==0)isPrime_num=false;
        // }
        // System.out.println(isPrime_num);

        // Divisor of a number
        int num=n;
        int ans=0;
        for(int i=1;i*i<=num;i++){
            if(n%i==0){
                if(n/i==i)ans+=1;
                else ans+=2;
            }
        }
        System.out.println(ans);
    }
}
