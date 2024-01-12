import java.util.Scanner;
public class SelectionSort{
    public static void selectionsort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
             int minpos = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }
            //swapp
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i] = temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= {4,2,5,3,6,4};
        selectionsort(arr);
        printarray(arr);

    }
}