public class Variables {
    public static void main(String[] args) {

        //String - stores text, such as "Hello". String values are surrounded by double quotes
        //int - stores integers (whole numbers), without decimals, such as 123 or -123
        //float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        //char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        //boolean - stores values with two states: true or false

        //syntax: type variableName = value;
        //int number = 5;
        //float myFloatNum = 3.48f;
        //char letter = 'A';
        //boolean myBool = true;
        //String text = "Hello";

        //The general rules for naming variables are:
        //Names can contain letters, digits, underscores, and dollar signs
        //Names must begin with a letter
        //Names should start with a lowercase letter and it cannot contain whitespace
        //Names can also begin with $ and _
        //Names are case sensitive ("myVar" and "myvar" are different variables)
        //Reserved words (like Java keywords, such as int or boolean) cannot be used as names

        String name = "Karen";   // type:string  variableName:name = value:Karen
        System.out.println(name);

        String firstName = "John ";
        String lastName = "Albert";
        String fullName = firstName + lastName;
        System.out.println(fullName);


        int number = 15;    // type:int  variableName:number = value:15
        System.out.println(number);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        //To declare more than one variable of the same type,
        //you can use a comma-separated list:
        int a = 5, b = 12, c = 33;
        System.out.println(a + b + c);


        //if you assign a new value to an existing variable,
        //it will overwrite the previous value:
        int myNum  = 15;
        myNum  = 33;  // number is now 20
        System.out.println(myNum );

        //"final" or "constant", which means unchangeable and read-only
        //final int num = 15;
        //num = 20;  //if we try assign a new value for num IDE will generate an error: cannot assign a value to a final variable


    }
}
