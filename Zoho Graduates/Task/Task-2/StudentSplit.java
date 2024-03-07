// Write a program for the following. Let consider 20 students in a class with the roll no
// 101-120. We are going to split them into four groups. Based on their roll number we are
// going to split them with the following logics.

public class StudentSplit 
{
    public static void main(String[] args) 
    {
        int numStudents = 20;
        splitStudents(numStudents);
    }

    public static void splitStudents(int numStudents) 
    {
        if(numStudents % 4 != 0) 
        {
            System.out.println("Number of students must be divisible by 4.");
            return;
        }

        int groupSize = numStudents / 4;
        int[] rollNumbers = new int[numStudents];

        for(int i = 0; i < numStudents; i++) 
        {
            rollNumbers[i] = 101 + i;
        }

        int[][] groups = new int[4][groupSize];

        for(int i = 0; i < 4; i++) 
        {
            for(int j = 0; j < groupSize; j++) 
            {
                groups[i][j] = rollNumbers[i + j * 4];
            }
        }

        System.out.println("Output:");
        for(int i = 0; i < 4; i++) 
        {
            System.out.println("Group " + (i + 1) + ":");
            for (int j = 0; j < groupSize; j++) 
            {
                System.out.println(groups[i][j]);
            }
            System.out.println();
        }
    }
}
