public class Conditions {
    public static void main(String[] args) {

        //Less than: a < b
        //Less than or equal to: a <= b
        //Greater than: a > b
        //Greater than or equal to: a >= b
        //Equal to a == b
        //Not Equal to: a != b

        //  if (condition) {
        //  // block of code to be executed if the condition is true
        //} else {
        //  // block of code to be executed if the condition is false
        //}


        //  if (condition1) {
        //  // block of code to be executed if condition1 is true
        //  } else if (condition2) {
        //  // block of code to be executed if the condition1 is false and condition2 is true
        //  } else {
        //  // block of code to be executed if the condition1 is false and condition2 is false
        //}

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }


        //Short Hand If...Else
        //variable = (condition) ? expressionTrue :  expressionFalse;
        int number = 15;
        String result = (number < 10) ? "number less than 10" : "number is greater than 10";
        System.out.println("result is: " +result);

        //               *   Switch Case   *
        //Instead of writing many if..else statements,
        //you can use the switch statement
        //Syntax:

        //  switch(expression) {
        //  case x:
        //    // code block
        //    break;
        //  case y:
        //    // code block
        //    break;
        //  default:
        //    // code block
        //}

        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


    }
}
