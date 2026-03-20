public class Maths3 {
     public static void swapNumbers(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // 2. First 10 even numbers, skip multiples of 4
    public static void printEvenSkip4() {
        System.out.print("Even numbers (skip multiples of 4): ");
        for(int i=2; i<=20; i += 2) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 3. Fibonacci Series
    public static void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 4. Binary to Decimal
    public static void binaryToDecimal(int binary) {
        int decimal = 0;
        int base = 1;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal value: " + decimal);
    }

    public static void main(String[] args) {

        // 1. 
        swapNumbers(5, 10);

        System.out.println();

        // 2. 
        printEvenSkip4();

        System.out.println();

        // 3. 
        fibonacci(10);

        System.out.println();

        // 4. 
        binaryToDecimal(1011);
    }
}