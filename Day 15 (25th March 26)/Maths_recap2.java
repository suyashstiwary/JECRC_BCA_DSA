public class Maths_recap2 {
    public static void main(String[] args) {
        int n=28;
        int num=n;
        for(int i=2;i*i<=n;i++){
            while(num%i==0){
                System.out.print(i+" ");
                num=num/i;
            }
        }
        if(num>1)System.out.print(num);
    }
}
