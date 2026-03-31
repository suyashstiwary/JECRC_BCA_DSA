public class Functions_revision {
    // void datatype
    // public void printNumbers(int n){
    //     // int n=10;
    //     for(int i=1;i<=n;i++)System.out.print(i+" ");
    //     System.out.println("");
    // }

    // int datatype
    // public int add(int a,int b){
    //     // int a=5,b=4;
    //     a=a+1;
    //     // System.out.println(a);
    //     return a+b;
    // }

    //boolean datatype
    public boolean isPrime(int n){
        // boolean prime=true;
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public void main(String[] args) {
        // printNumbers(10);
        // printNumbers(10);
        // int a=5;
        // int b=6;
        // int c=add(a,b);
        // System.out.println(a);
        // System.out.println(isPrime(12));
        int n=15;
        for(int i=1;i<=n;i++){
            if(isPrime(i))System.out.print(i+" ");
        }
    }
}
