import java.util.*;

public class Tut12Strings{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name");
        String fname= sc.next();
        System.out.println("Enter your last name");
        String lname= sc.next();

        //Concatenation
        String fullN= fname+" "+lname;
        System.out.println("Your first name is :" +fname );
        System.out.println("Your last name is :" +lname );
        System.out.println("Your full name is "+fullN);

        //length function
        System.out.println("The length of your name is "+fullN.length());

        //charAt function
        for(int i=0; i<fullN.length(); i++){
            System.out.println(fullN.charAt(i));
        }

        //Comaparing two strings
        // Checks the 3 cases
        // 1 s1 > s2 : returns +ve value 
        // 2 s == s2 : returns 0
        // 3 s1 < s2 : returns -ve value
        if(fname.compareTo(lname)==0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }

        //Substring 
        String sb=fullN.substring(5);
        System.out.println("Substring is "+sb);

        //Strings are immutable

    }
}