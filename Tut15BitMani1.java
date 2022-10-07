import java.util.*;

//Set bit example Previous number was 5 after bit manipulation value changed to 7
public class Tut15BitMani1{
public static void main(String args[]){
    int n=5;
    int pos=1;
    int bitMask= 1<<pos;

    int newNumber= bitMask | n;
    System.out.println(newNumber);
}
}