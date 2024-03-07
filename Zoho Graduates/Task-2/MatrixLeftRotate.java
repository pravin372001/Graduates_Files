public class MatrixLeftRotate 
{
    public static void main(String[] args) 
    {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);    
    }    
    public static void rotate(int[][] matrix)
    {
        for(int i = matrix.length-1; i >= 0; i--)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
