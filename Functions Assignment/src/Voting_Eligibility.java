import java.util.Scanner;
public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(eligible(age))
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }

    static boolean eligible(int x)
    {
        if(x>=18)
            return true;
        return false;
    }
}
