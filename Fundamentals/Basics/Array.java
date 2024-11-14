public class Array {
    public static void main(Strings[] args) {
        // 1d arrray
        int a[] = { 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // 2d array
        int d[][] = new int[3][4];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                System.out.print((d[i][j] = (int) (Math.random() * 10)) + " ");
            }
            System.out.println();
        }

        // jagged array
        int b[][] = new int[3][];
        b[0] = new int[] { 0, 1 };
        b[1] = new int[] { 0, 1, 4 };
        b[2] = new int[] { 0, 1, 6, 8 };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// array is collection of similar datatype that hold the values