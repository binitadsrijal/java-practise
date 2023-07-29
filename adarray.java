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
//sort array with even at begining and odd at end
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
            if ((arr[i]%2)!=0 && (arr[j]%2) == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if ((arr[i]%2 == 0)) {
                i++;
            }
            if (arr[j]%2 != 0) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 2, 19, 9, 5, 13, 14,10,11,17,12,4, };
        sorting(arr);

        System.out.println("Sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
//sorting the square of array(non decreasing array) in non decreasing order 

public class adarray {
     static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void print(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] answer(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int k = 0;
        int i=0;
        int j=n-1;
        while(i<=j){
         if(Math.abs(arr[i])>Math.abs(arr[j])){
            ans[k++]=arr[i]*arr[i];
            i++;
         }
         else{
            ans[k++]=arr[j]*arr[j];
            j--;
         }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { -9, -3, -2, -1, 1, 3, 5, 8 };
      int ans[]=  answer(arr);
        reverse(ans);
        print(ans);

    }
}
// prefix sum questions
