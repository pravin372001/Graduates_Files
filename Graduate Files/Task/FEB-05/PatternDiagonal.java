import java.util.Scanner;

public class PatternDiagonal 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter the row: ");
        int row = in.nextInt();
        int temp = 1;
        int pat[][] = new int[row][row];
        int i=0;
        int j=0;
        int boundary = row*(row+1)/2;
        while(temp <= boundary)
        {   
            while(i<row && j<row && pat[i][j]==0)
            {
                pat[i][j] = temp++;
                i++;
                j++;
            }
            i = i-2;
            j--;
            while(i>=0 && pat[i][j]==0)
            {
                pat[i][j] = temp++;
                i--;
            } 
            i++;
            j--;
            while(j>=0 && pat[i][j]==0)
            {
                pat[i][j] = temp++;
                j--;
            }
            i++;
            j=j+2;
        }
        for(int k=0; k<row; k++)
        {
            for(int l=0; l<row; l++)
            {
                int value = pat[k][l];
                if(value == 0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(value+" ");
                }
            }
            System.out.println();
        }
        in.close();
    }    
}
