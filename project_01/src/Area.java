import java.util.Scanner;
public class Area {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        Area ob=new Area();
        int exit=1;
        while(exit==1)
        {
            System.out.println("Enter \n 1.Area of Circle \n 2.Area of Triangle \n 3.Area of Rectangle " +
                    "\n 4.Area of Isosceles Triangle \n 5.Area of Parallelogram \n 6.Area of Rhombus \n " +
                    "7.Area of Equilateral Triangle \n 8.Exit \n Enter your choice:");
            char ch=in.next().trim().charAt(0);
            double area=0;

            switch (ch) {
                case '1' -> area = ob.area_circle();
                case '2' -> area = ob.area_Triangle();
                case '3' -> area = ob.area_Rectangle();
                case '4' -> area = ob.area_Triangle();
                case '5' -> area = ob.area_Parallelogram();
                case '6' -> area = ob.area_Rhombus();
                case '7' -> area = ob.area_Equilateral();
                case '8' -> exit = 0;
                default -> System.out.println("Invalid Input");
            }
            System.out.println("Area = "+area);
        }
    }
    public double area_circle()
    {
        System.out.println("Enter radius");
        double radius=in.nextDouble();
        return 3.14*Math.pow(radius,2);
    }

    public double area_Triangle()
    {
        System.out.println("Enter Base and height of triangle");
        double base=in.nextDouble();
        double height=in.nextDouble();
        return 0.5*base*height;
    }

    public double area_Rectangle()
    {
        System.out.println("Enter Length and Breadth of Rectangle");
        double length=in.nextDouble();
        double breadth=in.nextDouble();
        return length*breadth;
    }

    public double area_Parallelogram()
    {
        System.out.println("Enter Base and Height of Parallelogram");
        double base=in.nextDouble();
        double height=in.nextDouble();
        return base*height;

    }

    public double area_Rhombus()
    {
        System.out.println("Enter Diagonal 1 and Diagonal 2");
        double diagonal_1=in.nextDouble();
        double diagonal_2=in.nextDouble();
        return 0.5*diagonal_1*diagonal_2;
    }

    public double area_Equilateral()
    {
        System.out.println("Enter side of Equilateral Triangle");
        double side=in.nextDouble();
        return Math.sqrt(3)*Math.pow(side,2)*0.25;
    }
}
