import java.util.*;

public class Arrays_3 {

    public static void main(String[] args) {
        int a=5;
        int [] arr=new int[5];
        function(a, arr);
        System.out.println(a);
        System.out.println(arr[0]);
    }
    public static void function(int a,int []arr){
        a=a+1;
        arr[0]=arr[0]+1;
    }
}