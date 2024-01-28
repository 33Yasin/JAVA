public class Casting {
    public static void main(String[] args) {

        //Casting in Java refers to the process of converting a value of one data type to another.

        //This is necessary when you want to assign a value of one data type to a variable of
        //another data type, especially when there's a possibility of data loss or when you want
        //to perform operations involving different data types.

        //Widening (Implicit) Casting: This type of casting happens automatically
        //when a data type with smaller range or size is promoted to a data type with a larger range or size
        //byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt;        // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0


        //Narrowing Casting (manually): This type of casting requires explicit declaration and is done when a data type with
        //a larger range or size is converted to a data type with a smaller
        //double -> float -> long -> int -> char -> short -> byte
        double myDoubleNumber = 9.78d;
        int myIntNumber = (int) myDoubleNumber; // Manual casting: double to int
        System.out.println(myDoubleNumber);   // Outputs 9.78
        System.out.println(myIntNumber);      // Outputs 9


    }
}
