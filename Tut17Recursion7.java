import java.util.*;

// Program to find the n power of value x here x=2 n=5 ans is 2*2*2*2*2=32 using the stack height= log n
public class Tut17Recursion7{
    public static int calPower(int x, int n){
        if(n==0){
            return 1; //base case 1
        }
        if(x==0){
            return 0; //base case 2
        }
        if(n%2==0){ //if n is even
            return calPower(x,n/2)* calPower(x,n/2);
        }
        else{ //if n is odd
            return calPower(x, n/2) * calPower(x,n/2) *x;
        }
    }

    public static void main(String args[]){
        int x=2, n=5;
        System.out.println(calPower(x,n));
    }
}