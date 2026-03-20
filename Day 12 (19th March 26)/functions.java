public Functions {
    public static void decimalToBinary(int num) {
        String binary = "";

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;
            num /= 2;
        }

        System.out.println("Binary: " + binary);
    }
    public static void primeFactorization(int n) {
        System.out.print("Prime Factors: ");

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // 1.
        char ch = 'A';
        int x = ch;
        System.out.println("Output of char to int: " + x);

        // 2.
        System.out.println("Output of 'A' + 1: " + ('A' + 1));

        // 3. 
        double result = 10.0 / 3;
        System.out.printf("10/3 (3 decimal places): %.3f\n", result);

        // 4. 
        decimalToBinary(51);

        // 5. 
        primeFactorization(60);
    }
}