public class Maths_recap {
    public static void main(String[] args) {
        int a=35,b=12;
        int num1=a,num2=b;
        // int hcf=1;
        // for(int i=1;i<=((a<b)?a:b);i++){
        //     if(a%i==0&&b%i==0)hcf=i;
        // }
        // System.out.print(hcf);
        int hcf=0;
        while(a>0&&b>0){
            if(a>b)a=a%b;
            else b=b%a;
        }
        if(a==0)hcf=b;
        else hcf=a;

        int lcm=(num1*num2)/hcf;
        System.out.println(lcm);

        // code to calculate divisors
        // int n=36;
        // for(int i=1;i<=Math.sqrt(n);i++){
        //     if(n%i==0){
        //         System.out.print(i+" ");
        //         if(n/i!=i)System.out.println(n/i);
        //     }
        // }
    }
}
