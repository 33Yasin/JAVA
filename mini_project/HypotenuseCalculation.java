import java.util.Scanner;           // Scanner class to get inputs

public class HypotenuseCalculation {
    public static void main(String[] args) {

        //Write a program using ava that takes the length of the perpendicular
        //sides from the user and calculates the hypotenuse of the triangle.

        Scanner input = new Scanner(System.in);
        double edge1, edge2, hypotenuse_edge,perimeter_of_triangle,area_of_triangle;

        // get inputs
        System.out.println("please enter edge1: ");
        edge1 = input.nextInt();
        System.out.println("please enter edge2: ");
        edge2 = input.nextInt();

        //calculate hypotenuse,perimeter and area of triangle
        hypotenuse_edge = Math.sqrt( edge1*edge1 + edge2*edge2);
        System.out.println("hypotenuse edge is: " +hypotenuse_edge);

        perimeter_of_triangle = edge1 + edge2 + hypotenuse_edge;
        System.out.println("perimeter of triangle" +perimeter_of_triangle);

        area_of_triangle = (edge1 * edge2) / 2 ;
        System.out.println("area of triangle is: " +area_of_triangle);


    }
}
