import java.util.*;

//Get bit example after bit manipulation found out if the number is zero or one
public class Tut15BitMani{
    public static void main(String args[]){
        int n=5; //0101
        int pos=3;
        int bitMask= 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}