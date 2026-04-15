import java.util.Scanner;

public class Arrays_2 {
    public static int add(int a,int b,int [] arr){
        a=a+1;
        arr[0]=arr[0]+1;
        // System.out.println(a);
        return a+b;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int [] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // print the array
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println("");
        // int a=5,b=6;
        // int sum=add(a,b,arr);
        // System.out.println(sum);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // int [] arr2=arr;
        // arr2[1]=6;
        // System.out.println(arr[1]);
        // System.out.println(a);

        // int [] arr={1,4,2,1,6556,1,8};
        // int highest=arr[0],sec_highest=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>highest){
        //         sec_highest=highest;
        //         highest=arr[i];
        //     }
        //     else if(arr[i]<highest&&arr[i]>sec_highest){
        //         sec_highest=arr[i];
        //     }
        // }
        // System.out.println(highest+" "+sec_highest);

        int [] arr={1,2,3,4,4,5};
        int duplicate=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])duplicate=arr[i];
        }
        System.out.println(duplicate);
    }
}
