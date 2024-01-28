public class DataTypes {
    public static void main(String[] args) {

        //Data types are divided into two groups:
        //Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes.


        //Primitive types are the most basic data types built into the Java language.
        //They represent simple values directly in memory, without the overhead of objects.
        //Java has 8 primitive types:
        //boolean: Stores true or false values (1 bit).
        //byte: Stores whole numbers from -128 to 127 (8 bits).
        //short: Stores whole numbers from -32,768 to 32,767 (16 bits).
        //int: Stores whole numbers from -2,147,483,648 to 2,147,483,647 (default for integers, 32 bits).
        //long: Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64 bits).
        //float: Stores single-precision floating-point numbers (32 bits).
        //double: Stores double-precision floating-point numbers (default for decimals, 64 bits).
        //char: Stores single characters (16 bits, using Unicode)

        //First we defined our variables
        String greeting = "Hello World";
        int age = 25;
        double pi = 3.14159;
        char initial = 'A';
        boolean isTrue = true;
        float myFloatNum = 5.75f;
        double myDoubleNum = 19.99d;

        //Then we printed it to the console with System.out.println()
        System.out.println(greeting);
        System.out.println(age);
        System.out.println(pi);
        System.out.println(initial);
        System.out.println(isTrue);
        System.out.println(myFloatNum);
        System.out.println(myDoubleNum);



        //if you are familiar with ASCII values,
        //you can use those to display certain characters:
        char myVar1 = 65, myVar2 = 66;
        System.out.println(myVar1);
        System.out.println(myVar2);


        //Non-Primitive Data Types:
        //Non-primitive data types are not predefined by the language; they are created by the programmer.
        //They are also called reference types because they reference objects in memory.
        //They store references (memory addresses) to objects rather than the actual data.
        //Examples include classes, arrays, interfaces, etc.
        //They can have methods, and their sizes are not predefined.

    }
}
