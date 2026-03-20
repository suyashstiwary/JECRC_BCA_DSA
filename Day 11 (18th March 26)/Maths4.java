public class Maths4 {
    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if(a>b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a==0) {
            return b;
        }
        else return a;
    }

    // 2. LCM using GCD
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 3. Pascal Triangle
    public static void pascalTriangle(int rows) {
        System.out.println("Pascal Triangle:");
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a = 12, b = 18;

        // 1. 
        int gcdResult = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " = " + gcdResult);

        // 2. 
        int lcmResult = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " = " + lcmResult);

        System.out.println();

        // 3. 
        pascalTriangle(5);
    }
}