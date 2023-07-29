
//matrix addition ---2d array-----------------------------------------------------------*

public class array2d {
    // printing function
    static void printii(int b[][]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void matrixadd(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if ((r1 != r2) || (c1 != c2)) {
            System.out.println("wrong Input !!");
            return;
        }
        int sum[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
         
        }
           System.out.println("matrix of addition");
            printii(sum);

    }

    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 },
                { 1, 2, 3 } };
        int r1 = 2;
        int c1 = 3;
        System.out.println("1st matrix");
       printii(a);
        int[][] b = { { 1, 2, 3 },
                { 3, 2, 1 } };
        int r2 = 2;
        int c2 = 3;
        System.out.println("2nd matrix");
        printii(b);
        matrixadd(a, r1, c1, b, r2, c2);
    }
}
