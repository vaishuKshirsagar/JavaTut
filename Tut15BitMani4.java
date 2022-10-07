import java.util.*;

//Update the 2nd bit (position=1) of number n (n=0101)
public class Tut15BitMani4{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int oper= sc.nextInt();

        //Operation=1 : set oper=0 : clear
        int n= 5; //0101 -> 0111 -> dec 7
        int pos= 1;

        int bitMask= 1<<pos;
        if(oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask= ~(bitMask);
            int newNumber= newBitMask & n;
            System.out.println(newNumber);
        }
    }
}