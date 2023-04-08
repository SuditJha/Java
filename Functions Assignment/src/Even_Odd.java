import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter A Number");
        n=sc.nextInt();
        if(even_odd(n))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    private static boolean even_odd(int n) {
        if(n%2==0)
            return true;
        return false;
    }
}
