import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr2=new int [n];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        // for(int i=0;i<arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }
        int index=-1,num=arr2[0];
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>num){
                index=i;
                num=arr2[i];
            }
        }
        System.out.println(index);
    }
}
