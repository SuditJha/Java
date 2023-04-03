/**Write a program to input principal, time, and rate (P, T, R) from the user and
 find Simple Interest.*/
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal : ");
        double p=sc.nextDouble();
        System.out.println("Enter Rate :");
        double r=sc.nextDouble();
        System.out.println("Enter Time :");
        double t=sc.nextDouble();
        System.out.println("Interest = "+ (p*r*t)/100);

    }
}
