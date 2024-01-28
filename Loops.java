public class Loops {
    public static void main(String[] args) {

        //Loops can execute a block of code as long as
        //a specified condition is reached.




        //          *  While  *
        //Syntax:
        //while (condition) {
        //  // code block to be executed
        //}

        System.out.println("While:");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------");




        //          *   For   *
        //Syntax:
        //for (statement 1; statement 2; statement 3) {
        //  // code block to be executed
        //}
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.

        System.out.println("For:");
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
        System.out.println("-------------------");





        //            *   Nested Loops   *
        //It is also possible to place a loop inside another loop.
        //This is called a nested loop.
        // Outer loop

        System.out.println("Nested loops:");
        for (int a = 1; a <= 2; a++) {
            System.out.println("Outer: " + a); // Executes 2 times

            // Inner loop
            for (int b = 1; b <= 3; b++) {
                System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
            }
        }
        System.out.println("-------------------");


        //          *   For Each Loops     *
        //for-each" loop, which is used exclusively
        //to loop through elements in an array
        //Syntax:
        //for (type variableName : arrayName) {
        //  // code block to be executed
        //}

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String x : cars) {
            System.out.println(x);
        }


    }
}
