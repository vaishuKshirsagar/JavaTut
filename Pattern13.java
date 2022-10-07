import java.util.*;
// Palindrome numbers
/*
    1
   121
  32123
 4321234
543212345

*/
public class Pattern13{
    public static void main(String args[]){
        int n= 5;
        //Outer loop
        for(int i=1; i<=n; i++){
            
            //Spaces
            for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
            
            //First half numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }    

            //Second half
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

             System.out.println();
        }
    }
}  