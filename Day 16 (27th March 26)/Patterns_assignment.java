public class Patterns_assignment {
    public static void main(String[] args) {
        int n=3;
        for(int row=1;row<=n;row++){
            int count=row;
            for(int col=1;col<=n-row;col++)System.out.print(" ");
            for(int col=1;col<=2*(row)-1;col++){

                System.out.print(count);
                if(col>=row)count--;
                else count++;
            }
            for(int col=1;col<=n-row;col++)System.out.print(" ");
            System.out.println("");
        }
    }
}
