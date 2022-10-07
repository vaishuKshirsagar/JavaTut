import java.util.Scanner;
public class ProductFun{

    public static int calProduct(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("The product is "+calProduct(a,b));

    }
}