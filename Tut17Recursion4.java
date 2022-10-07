import java.util.*;

public class Tut17Recursion4{
    public static int calFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1= calFactorial(n-1);
        int fact= n* fact_nm1;
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(calFactorial(n));
    }
}