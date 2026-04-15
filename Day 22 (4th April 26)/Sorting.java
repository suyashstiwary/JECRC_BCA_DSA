public class Sorting {
    public static void main(String[] args) {
        // bubble sort
        int [] arr={1,6,0,2,5};
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Selection sort

        // int n=arr.length;
        // for(int i=0;i<n-1;i++){
        //     int min=i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]<arr[min]){
        //             min=j;
        //         }
        //     }
        //     int temp=arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }



        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // insertion sort
        int n=arr.length;
        for(int i=1;i<n;i++){
            int num=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>num){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=num;
        }
        // for printing the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
