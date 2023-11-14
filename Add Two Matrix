import java.util.*;
class arradd
{
	public static void main(String args[])
	{
		int j,i;
		System.out.print("Enter the number of row and column of 1st and 2nd array");
		Scanner add=new Scanner(System.in);
		int r1=add.nextInt();
		int c1=add.nextInt();
		System.out.print("Enter the element of 1st array");
		int a1[][]= new int[r1][c1];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				a1[i][j]=add.nextInt();
			}
		}
		System.out.print("Enter the element of 2nd array");
		int a2[][]= new int[r1][c1];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				a2[i][j]=add.nextInt();
			}
		}
		System.out.println("Entered 1st array is");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				System.out.print(a1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Entered 2nd array is");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				System.out.print(a2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Added Maatrix is");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{	
				a1[i][j]=(a1[i][j]+a2[i][j]);
				System.out.print(a1[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
