import java.util.*;

public class Tut11TwoDArr{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int[][] numbers=new int[rows][cols];

        //input
        // rows  
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        //Take a matrix as an input. Search for a given number x and print the indices at which it occurs
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location (" + i +","+ j +")");
                }
                
            }
        }
        
        //output will print the matrix
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }

    }
}