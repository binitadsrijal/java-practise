//sorting between numbers 0 &1
/* 
public class adarray {
    static void sort(int arr[]) {
        int counto = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counto++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < counto) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    public static void main(String[]args) {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1, 0, 1, 0 };
        sort(arr);
        // printing
        System.out.println("Sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}       //not so best approach
*/
//same question with best approach
/* 
public class adarray {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sorting(int arr[]) {
        int j = arr.length - 1;
        int i = 0;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 1, 0, 1, 0, 1, 0 };
        sorting(arr);

        System.out.println("Sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
