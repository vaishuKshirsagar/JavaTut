//In java strings are immutable thats why we use string builder to modify the string
import java.util.*;
public class Tut13Strbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Vaishnavi");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert the character at index
        sb.insert(2,'S');
        System.out.println(sb);

        //Delete the S
        sb.delete(2,3);
        System.out.println(sb);
        
        //Appending character in string
        sb.setCharAt(0,'V');
        sb.append(" ");
        sb.append("K");
        sb.append("s");
        sb.append("h");
        sb.append("i");
        sb.append("r");
        sb.append("s");
        sb.append("a");
        sb.append("g");
        sb.append("a");
        sb.append("r");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}