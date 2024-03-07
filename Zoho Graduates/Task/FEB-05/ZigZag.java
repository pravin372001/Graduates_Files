import java.util.Scanner;

public class ZigZag
{	
	static void ZigzagPrint(String str, int k)
	{
		if(str == null || k==0)
		{
			return;
		}
		
		if(k==1)
		{
			System.out.println(str);
		}
		
		//first row
        int tempf = 0;
		for(int i=0; i<str.length(); i++)
		{
            if(i == tempf)
            {
                System.out.print(str.charAt(i));
                tempf = i + (k-1)*2;
            }
            else
            {
                System.out.print(" ");
            }
		}
        System.out.println();
		//middle row
		for(int j=1; j<k-1; j++)
		{
			boolean shift = true;
			for(int i=j; i<str.length();)
			{
				System.out.print(str.charAt(i));
				if(shift)
				{
                    System.out.print(" ");
					i+=(k-j-1)*2;
				}
				else
				{
                    System.out.print(" ");
					i+= ((k-1)*2) - ((k-j-1)*2);
				}
				shift = !shift;
			}
		}
        System.out.println();
		//last_row
        int templ = k-1;
		for(int i=k-1; i<str.length(); i++)
		{
            if(i == templ)
            {
                System.out.print(str.charAt(i));
                templ = i + (k-1)*2;
            }
            else
            {
                System.out.print(" ");
            }
		}
	}
	
	public static void main(String args[])
	{
		int Number;
		String Sensentance;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number of zigzag Row:");
		Number = in.nextInt();
		
		System.out.print("Input the target :");
		Sensentance = in.next();
		
		ZigzagPrint(Sensentance, Number);
		in.close();
	}
}
