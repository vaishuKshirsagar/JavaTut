import java.util.*;

//Print numbers from 1 to 5 using recursion
public class Tut17Recursion2{
    public static void printNum(int n){
        if(n==6){
        return;
        }
        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String args[]){
        int n=1;
        printNum(n); //n=1
    }
}