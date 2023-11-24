import java.util.*;
class arrtrace
{
	public static void main(String args[])
	{
		int j,i;
		System.out.print("Enter the number of row and column of array");
		Scanner add=new Scanner(System.in);
		int r1=add.nextInt();
		int c1=add.nextInt();
		System.out.print("Enter the element of array");
		int a1[][]= new int[r1][c1];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				a1[i][j]=add.nextInt();
			}
		}
		System.out.println("Entered array is");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				System.out.print(a1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("traces of array are");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				if(i==j)
				{
					System.out.print(a1[i][j]+"\t");
				}
			}
			System.out.print("\n");
		}
	}
}
