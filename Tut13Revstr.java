import java.util.*;
public class Tut13Revstr{
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("hello");
        //Reversing the string
        for(int i=0; i<sb.length()/2; i++){
            int front=i;
            int back=sb.length()-1-i; //20-1-0=>19

            char frontChar= sb.charAt(front);
            char backChar= sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
//Time complexity of this code will O(n) cuz this code will run from 0th index to n/2(constant)