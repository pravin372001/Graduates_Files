import java.util.Scanner;

public class IntersectOrNot 
{
    public static boolean isIntersect(int[][] line1, int[][] line2)
    {
        int line1midx = (line1[0][0] + line1[1][0]) / 2;
        int line2midx = (line2[0][0] + line2[1][0]) / 2;
        int line1midy = (line1[0][1] + line1[1][1]) / 2;
        int line2midy = (line2[0][1] + line2[1][1]) / 2;
        return line1midx == line2midx && line1midy == line2midy;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Line axis: ");
        int [][] line1 = new int[][] {{in.nextInt(), in.nextInt()}, {in.nextInt(), in.nextInt()}};
        int [][] line2 = new int[][] {{in.nextInt(), in.nextInt()}, {in.nextInt(), in.nextInt()}};
        System.out.println(isIntersect(line1, line2) ? "Intersect" : "Not Intersect");
        in.close();
    }    
}
