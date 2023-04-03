/** Take in two numbers and an operator (+, -, *, /) and calculate the value.
 (Use if conditions)*/
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers :");
        double x=sc.nextInt();
        double y=sc.nextInt();
        System.out.println("Enter operation : + - * /");
        char op=sc.next().charAt(0);
        if(op=='+')
            System.out.println(x+y);
        else if (op=='-')
            System.out.println(x-y);
        else if(op=='*')
            System.out.println(x*y);
        else if(op=='/' && y!=0)
            System.out.println(x/y);
        else
            System.out.println("Wrong Input!!!");
    }
}
