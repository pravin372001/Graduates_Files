import java.util.Scanner;

public class PrintDiamond
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n;
	    n = in.nextInt();
	    printDiamond(n);
	}
	
	private static void printDiamond(int n)
	{
	    int temp = 1;
	    for(int i=1; i<=n/2+1; i++){
	        for(int k = 0;k<n/2+1-i; k++){
	            System.out.print("  ");
	        }
	        for(int j=0; j<2*i-1; j++){
	            System.out.print(temp+" ");
	            temp = (temp == 1) ? 2 : 1;
	        }
	        System.out.println();
	    }
	    
	    for (int i = n / 2; i >= 1; i--) {
            for (int k = 0; k < n / 2 + 1 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(temp + " ");
                temp = (temp == 1) ? 2 : 1;
            }
            System.out.println();
        }
	}
}