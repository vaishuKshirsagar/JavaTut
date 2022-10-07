import java.util.*;

// Program to find the n power of value x here x=2 n=5 ans is 2*2*2*2*2=32 using stack height = n
public class Tut17Recursion6{
    public static int calPower(int x, int n){
        if(n==0){
            return 1; //base case 1
        }
        if(x==0){
            return 0; //base case 2
        }
        int xPowerm1 = calPower(x, n-1); //Operation
        int xPowern= x* xPowerm1;
        return xPowern;
    }

    public static void main(String args[]){
        int x=2, n=5;
        System.out.println(calPower(x,n));
    }
}