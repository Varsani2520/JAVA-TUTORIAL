public class Patterns {
    public static void main(Strings args[]) {
        // p-1 :print * in 5 row only
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 0; j++) {
                System.out.println("*");
            }

        }

        // p-2 :print * in 5 column only
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*" + " ");
            }

        }

        // p-3 :print * in 4 x5 merics solid rectangluar
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        // p-4 : print * only border and merics is 4*5
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 4) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");

                }
            }
            System.out.println(" ");
        }

        // p-5 : print * in half pyramid
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        // p-6 : print * in inverted half pyramid
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        // p-7 : print * in inverted half pyramid 180degree
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= 0; j--) {
                System.out.print("*" + " ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print( " ");
            }
            System.out.println(" ");
        }
    }
}
