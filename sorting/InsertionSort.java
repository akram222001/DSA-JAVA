//insertion sort
import java.util.Scanner;
public class InsertionSort{
    public static void insertionsort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1; // -1
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insrtion
            arr[prev+1] = curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {4,2,9,5,3,6,1};
        insertionsort(arr);

        printarr(arr);
        // System.out.print(arr[-1]);
    }
}