/**Take name as input and print a greeting message for that particular name.*/
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String s=in.nextLine();
        System.out.println("Hello "+s+"! Welcome to the world of Java.");
    }
}
