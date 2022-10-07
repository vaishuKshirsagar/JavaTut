import java.util.*;

//Time complexity (worst case) will be O(n) 
class Tut16BSorting{
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};

        //In this program time complexity will be O(n^2) because of two loops
        //bubble sort
        for(int i=0; i<arr.length-1; i++){ //n-1
            for(int j=0; j<arr.length-i-1; j++){ //n times in 1st iteration then n-1 n-2 n-3...
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

        printArray(arr);
    }
}