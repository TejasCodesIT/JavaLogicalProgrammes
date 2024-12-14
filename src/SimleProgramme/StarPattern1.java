package SimleProgramme;

public class StarPattern1 {
    public static void main(String[] args) {
        int row = 10; // Number of rows for the pattern

        // Upper triangle
        for (int i = 1; i <= row; i++) {
            // Print leading spaces
        	
        	
            for (int space = row - i; space > 0; space--) {
                System.out.print("  ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower triangle
        for (int i = row - 1; i > 0; i--) {
            // Print leading spaces
            for (int space = row - i; space > 0; space--) {
                System.out.print("  ");
            }

            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
