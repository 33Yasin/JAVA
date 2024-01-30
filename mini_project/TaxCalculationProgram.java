import java.util.Scanner;

public class TaxCalculationProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double normal_price;
        double total_price = 0;

        System.out.println("Enter the normal price of the products: ");
        normal_price = input.nextInt();

        if(normal_price>=0 && normal_price<=2999){
            total_price = normal_price * 1.18;
        }
        else if (normal_price >= 2999){
            total_price = normal_price * 1.08;
        }
        else{
            System.out.println("Error!! You enter invalid number...");
        }

        System.out.println("Total price is: " +total_price +" dollar.");


    }
}
