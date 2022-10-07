import java.util.*;

//Clear the 3rd bit (position=2) of a number n (0101) using operation AND with NOT
public class Tut15BitMani3{
    public static void main(String args[]){
        int n = 5; //0101
        int pos= 2;
        int bitMask= 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber= notBitMask & n;
        System.out.println(newNumber);
    }
}