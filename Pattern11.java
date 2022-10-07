import java.util.*;
// Solid rhombus
/*
    *****
   *****
  *****
 *****
*****

*/

public class Pattern11{
    public static void main(String args[]){
        int n= 5;
        //Outer loop
        for(int i=1; i<=n; i++){
            
            //Spaces
            for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
            
            //Stars   
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }    
             System.out.println();
        }
    }
}        