import java.util.Scanner;
public class Sum_Product {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum(a,b);
        product(a,b);
    }

    static void sum(int a, int b)
    {
        System.out.println("Sum is : "+(a+b));

    }

    static void product(int a,int b)
    {
        System.out.println("Product is : "+a*b);
    }
}
