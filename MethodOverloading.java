public class MethodOverloading {

    // Method overloading: same method name
    // with different parameters or return types

    // Method 1: Adding two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adding three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Adding two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method 4: Concatenating two strings
    public static String add(String a, String b) {
        return a + b;
    }


    public static void main(String[] args) {

        // Calling Method 1
        int sum1 = add(3, 5);
        System.out.println("Sum of two integers: " + sum1);

        // Calling Method 2
        int sum2 = add(3, 5, 7);
        System.out.println("Sum of three integers: " + sum2);

        // Calling Method 3
        double sum3 = add(3.5, 2.7);
        System.out.println("Sum of two doubles: " + sum3);

        // Calling Method 4
        String concatenatedString = add("Hello, ", "world!");
        System.out.println("Concatenated string: " + concatenatedString);

    }
}
