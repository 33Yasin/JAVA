import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double height,weight,bmi;

        System.out.println("please enter your height: ");
        height = input.nextDouble();
        System.out.println("please enter your weight: ");
        weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Your body mass index is: " +bmi);

        if(bmi < 18.5){
            System.out.println("Your are thin :)");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your are ideal :))");
        }
        else if(bmi > 24.9 && bmi <= 29.9){
            System.out.println("Your are fat :(");
        }
        else if(bmi > 29.9 && bmi <= 34.9){
            System.out.println("Your are obese :((");
        }
        else{
            System.out.println("Your are extremely obese :(((");
        }


    }
}
