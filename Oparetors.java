public class Oparetors {
    public static void main(String[] args) {

        // +	Addition	Adds together two values	x + y
        // -	Subtraction	Subtracts one value from another	x - y
        // *	Multiplication	Multiplies two values	x * y
        // /	Division	Divides one value by another	x / y
        // %	Modulus	Returns the division remainder	x % y
        // ++	Increment	Increases the value of a variable by 1	++x
        // --	Decrement	Decreases the value of a variable by 1	--x

        int number1 = 10;
        int number2 = 5;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);
        System.out.println(++number1);
        System.out.println(--number2);


        // operator  example    same as
        // =	     x = 5	    x = 5
        // +=	     x += 3	    x = x + 3
        // -=	     x -= 3  	x = x - 3
        // *=	     x *= 3  	x = x * 3
        // /=	     x /= 3	    x = x / 3
        // %=	     x %= 3	    x = x % 3

        int num = 7;
        num += 5;
        System.out.println("num is: " +num);

        int number = 100;
        number /= 20;
        System.out.println("number is: " +number);



        //                  * COMPARISON OPERATORS*
        //The return value of a comparison is either true or false.
        //These values are known as Boolean values
        int x = 15;
        int y = 13;
        System.out.println(x > y); // returns true, because 15 is higher than 13

        //  ==	Equal to	                x == y
        //  !=	Not equal	                x != y
        //  >	Greater than	            x > y
        //  <	Less than	                x < y
        //  >=	Greater than or equal to	x >= y
        //  <=	Less than or equal to	    x <= y


        //                      * LOGICAL OPERATORS *
        //Logical operators are used to determine
        //the logic between variables or values:
        // && 	Logical and	Returns true if both statements are true
        // || 	Logical or	Returns true if one of the statements is true
        // !	Logical not	Reverse the result, returns false if the result is true

        int variable1 = 14;
        int variable2 = 7;

        System.out.println((variable1 > variable2) && (variable1%variable2==0));  //it returns true because two condotions are true (true and true = true)


    }
}
