import java.util.*;
class arrmult
{
	public static void main(String args[])
	{
		int j,i,k;
		System.out.print("Enter the number of row and column of 1st array");
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
		System.out.print("Enter the number of row and column of 2nd array");
		int r2=add.nextInt();
		int c2=add.nextInt();
		System.out.print("Enter the element of 2nd array");
		int a2[][]= new int[r2][c2];
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
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
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{	
				System.out.print(a2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("Multiplied matrix is");
		int a3[][]= new int[r1][c2];
		if(c1==r2)
		{
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c1;j++)
				{
					a3[i][j]=0;
					for(k=0;k<r2;k++)
					{
						a3[i][j] +=a1[i][k]*a2[k][j];
					}
				
					System.out.print(a3[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
		System.out.println("Cannot multiply this matrix");
	}
}
