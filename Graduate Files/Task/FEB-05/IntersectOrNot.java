import java.util.Scanner;

public class IntersectOrNot 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line 1 x1:");
        double x1 = in.nextDouble();
        System.out.println("Enter line 1 y1:");
        double y1 = in.nextDouble();
        System.out.println("Enter line 1 x2:");
        double x2 = in.nextDouble();
        System.out.println("Enter line 1 y2:");
        double y2 = in.nextDouble();

        System.out.println("Enter line 2 x3:");
        double x3 = in.nextDouble();
        System.out.println("Enter line 2 y3:");
        double y3 = in.nextDouble();
        System.out.println("Enter line 2 x4:");
        double x4 = in.nextDouble();
        System.out.println("Enter line 2 y4:");
        double y4 = in.nextDouble();



        double a1=x2-x1;
        double a2=x4-x3;
        double a3=y2-y1;
        double a4=y4-y3;
        double determinant=a1*a4-a2*a3;
        if(determinant==0)
        {
            System.out.println("Does not intersect");
        }
        else 
        {
            double a=(a2*(y1-y3)-a4*(x1-x3))/determinant;
            double b=(a1*(y1-y3)-a3*(x1-x3))/determinant;

            if(a>=0 && a<=1 && b>=0 && b<=1)
            {
                System.out.println("Intersect");
            } 
            else 
            {
                System.out.println("Does not intersect");
            }
        }
        in.close();
    }
}