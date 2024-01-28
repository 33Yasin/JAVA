public class Break_Continue {
    public static void main(String[] args) {


        //break: It was used to "jump out" of a switch statement.
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        //continue: The continue statement breaks one iteration (in the loop),
        //if a specified condition occurs, and continues with the next iteration
        //in the loop.
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }




    }
}
