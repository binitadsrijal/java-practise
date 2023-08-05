package sorting;

public class selectionsort{
    static void selection(int arr[]){
int n=arr.length;
for(int i=0;i<n-1;i++){
    int min_index=i;
    for(int j=i+1;j<n;j++){
if(arr[i]>arr[j]){
    min_index=j;
}
    }
    //swapping
    if(i!=min_index){   //optimizedd
    int temp=arr[i];
    arr[i]=arr[min_index];
    arr[min_index]=temp;
    }
}
    }
    public static void main(String[]args){
int arr[]={2,1,4,3,5,8,6,7};
selection(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"  ");
}
    }
}

//time complexity=O(n^2)