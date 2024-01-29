public class Methods {

    // Method definition
    public static int add(int a, int b) {
        return a + b;       // Returns the sum of a and b
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int addFive(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {

        //In Java, methods are blocks of code
        //that perform a specific task or function.

        //Methods are used to break down a program into smaller,
        //manageable pieces, making the code more modular, readable,
        //and reusable.

        //void keyword -> indicates that the method should not return a value.
        //return keyword -> If you want the method to return a value

        //syntax:
        //  returnType methodName(parameterType1 parameter1, parameterType2 parameter2, ...) {
        //    // method body
        //  }

        int result = add(3, 5);         // Method invocation
        System.out.println("The result is: " + result);


        myMethod("Liam", 5);
        myMethod("Jenny", 8);

        System.out.println(addFive(3));

    }
}
