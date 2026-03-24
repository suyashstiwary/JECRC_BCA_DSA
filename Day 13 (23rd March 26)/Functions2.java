public class Functions2 {
    public static Boolean isArmstrong(int num){
        int duplicate=num;
        int count=0;
        while(duplicate>0){
            count++;
            duplicate/=10;
        }
        duplicate=num;
        int sum=0;
        while(duplicate>0){
            int digit=duplicate%10;
            sum=sum+(int)Math.pow(digit,count);
            duplicate/=10;
        }
        return num==sum;
    }
    public static void main(String[] args) {
        
        System.out.println(isArmstrong(127));
    }
}