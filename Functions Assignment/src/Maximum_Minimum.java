import java.util.Scanner;
public class Maximum_Minimum {
    public static void main(String[] args) {
        // Find The Largest of three Numbers as well as the smallest of three Numbers.
        Scanner in = new Scanner(System.in);
        int a,b,c,max,min;
        System.out.println("Enter three Numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        max=maximum(a,b,c);
        min=minimum(a,b,c);
        System.out.println(("Max : ")+max);
        System.out.println("Min : "+min);
    }

    private static int minimum(int a, int b, int c) {
        return (Math.min(a,(Math.min(b,c))));
    }

    private static int maximum(int a, int b, int c) {
        return (Math.max(a,(Math.max(b,c))));
    }
}
