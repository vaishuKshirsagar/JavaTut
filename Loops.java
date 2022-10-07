import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        for (int i=1; i<=5;i++){
            System.out.println("The number is "+i);
        }

        int n=10;

        //When the condition is false
        while(n<9){
            System.out.println("Hello Vaishnavi");
        }

        do{
            System.out.println("Hii Vaishnavi");
        } while(n<9);

      //To print the sum of n natural numbers
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to get sum");
        int x=sc.nextInt();
        int sum= 0;
        for(x=1; x<=n; x++){
            sum= sum+n;
        }
        System.out.println("The sum will be "+sum);
    } 
}