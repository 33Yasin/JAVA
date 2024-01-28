public class Maths {
    public static void main(String[] args) {

        //The Java Math class has many methods:

        // abs()    returns the absolute (positive) value of x:
        int num = -10;
        int absValue = Math.abs(num);
        System.out.println("Absolute value of " + num + ": " + absValue);

        // ceil()
        double numCeil = 3.14;
        double ceilValue = Math.ceil(numCeil);
        System.out.println("Ceiling value of " + numCeil + ": " + ceilValue);

        // floor()
        double numFloor = 3.14;
        double floorValue = Math.floor(numFloor);
        System.out.println("Floor value of " + numFloor + ": " + floorValue);

        // round()
        double numRound = 3.14;
        long roundedValue = Math.round(numRound);
        System.out.println("Rounded value of " + numRound + ": " + roundedValue);

        // max()    can be used to find the highest value of x and y:
        int numMax1 = 10;
        int numMax2 = 20;
        int maxValue = Math.max(numMax1, numMax2);
        System.out.println("Maximum value between " + numMax1 + " and " + numMax2 + ": " + maxValue);

        // min()    can be used to find the lowest value of x and y:
        int numMin1 = 10;
        int numMin2 = 20;
        int minValue = Math.min(numMin1, numMin2);
        System.out.println("Minimum value between " + numMin1 + " and " + numMin2 + ": " + minValue);

        // pow()
        double base = 2;
        double exponent = 3;
        double resultPow = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + resultPow);

        // sqrt()   returns the square root of x:
        double numSqrt = 16;
        double sqrtValue = Math.sqrt(numSqrt);
        System.out.println("Square root of " + numSqrt + ": " + sqrtValue);

        // random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        double randomNumber = Math.random();
        System.out.println("Random number between 0.0 and 1.0: " + randomNumber);





    }
}
