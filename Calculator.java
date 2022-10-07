import java.util.Scanner;
public class Calculator{

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int add= a+b;
        System.out.println("Addition :"+add);
        int sub= a-b;
        System.out.println("Subtraction :"+sub);
        int mul= a*b;
        System.out.println("Multiplication :"+mul);
        int div=a/b;
        System.out.println("Division :"+div);
    }
 }
