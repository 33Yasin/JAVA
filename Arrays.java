public class Arrays {
    public static void main(String[] args) {

        //Arrays are used to store multiple values in a single variable,
        //instead of declaring separate variables for each value

        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //int[] myNum = {10, 20, 30, 40};

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};
        myCars[0] = "Opel";
        System.out.println(myCars[0]);
        System.out.println(cars.length);

        String[] carsMe = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < carsMe.length; i++) {
            System.out.println(carsMe[i]);
        }


        //      *   MultiDimensional Arrays     *
        //Multidimensional arrays are useful when
        //you want to store data as a tabular form,
        //like a table with rows and columns.

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7

    }
}
