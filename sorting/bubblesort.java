package sorting;
//time complexity =O(n^2)

/* 
public class bubblesort {
    static void sorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args){
        int arr[]={2,6,3,4,1,7,8};
        sorting(arr);
        //printing
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
*/
//optimizing same code

public class bubblesort {
    static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            Boolean bool = false; // to optimize the code
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    bool = true; // if any swap happened it becomes true
                }
            }
            if (bool == false) { // has any swaps happened if no then return
                return;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 3, 4, 1, 7, 8 };
        sorting(arr);
        // printing
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
