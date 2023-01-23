package Loop;

public class For_Loop {
    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++) {

            for (int y = 1; y <= 5; y++) {

                System.out.println("X =" + x + " " + "Y =" + y);

            } //end y
        }// end x


//        Example
        int star = 5;
        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= i; j--) {
                System.out.print("+");
            } //end j
            System.out.println();
        } //end i
    }
}
