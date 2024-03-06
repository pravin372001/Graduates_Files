// Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
// details

import java.util.Scanner;
import java.util.ArrayList;

public class AntiDiagonals 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of Matrix: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of Matrix: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i=0; i<n*2-1; i++)
        {
            al.add(new ArrayList<>());
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                al.get(i+j).add(matrix[i][j]);
            }
        }
        System.out.println(al);
        in.close();
    }    
}
