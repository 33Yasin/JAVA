import java.util.Scanner;   // Scanner class

public class AvarageCalculatorProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   //to get input from the user

        int physics, maths,chemistry,biology,music,history; //variables
        double avg = 0;

        //get inputs
        System.out.println("Please enter your physics note: ");
        physics = input.nextInt();
        System.out.println("Please enter your maths note: ");
        maths = input.nextInt();
        System.out.println("Please enter your chemistry note: ");
        chemistry = input.nextInt();
        System.out.println("Please enter your biology note: ");
        biology = input.nextInt();
        System.out.println("Please enter your music note: ");
        music = input.nextInt();
        System.out.println("Please enter your history note: ");
        history = input.nextInt();

        //calculate average
        avg = (double) (physics+maths+chemistry+biology+music+history) / 6;

        //If it is over 60, it passes the class, otherwise it fails.
        if(avg > 60) {
            System.out.println("avarage of lessons: " + avg);
            System.out.println("passed the class");
        }
        else{
            System.out.println("avarage of lessons: " +avg);
            System.out.println("failed the class");
        }





    }
}
