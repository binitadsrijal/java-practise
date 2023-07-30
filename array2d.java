
//matrix addition ---2d array-----------------------------------------------------------*
/* 
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
*/

//matrix multiplication-------------------------------------------------------------*

public class array2d{
      static void printii(int b[][]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    } 

    static void mult(int arr[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(c1 != r2){
            System.out.println("multiplication not possible");
            return;
        }
        int mul[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("after multiplication");
        printii(mul);
    }
    public static void main(String[]args){
        int r1=4;
        int c1=3;
        // int arr[][]=new int[r1][c1];
        int arr[][]={{2,3,4},{5,6,7},{8,9,10},{11,12,13}};
        System.out.println("array 1");
       printii(arr);
        int r2=3;
        int c2=3;
        // int arr2[][]=new int[r2][c2];
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("array2");
        printii(arr2);
mult(arr,r1,c1,arr2,r2,c2);
    }
}