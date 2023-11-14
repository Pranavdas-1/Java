import java.util.*;
class frequency
{
	public static void main(String args[])
	{
		int i,n=0;
		System.out.print("Enter the String :- ");
		Scanner add=new Scanner(System.in);
		String S1=add.nextLine();
		System.out.print("Enter the character to be estimated  :- ");
		char S2=add.next().charAt(0);
		int l=S1.length();
		for(i=0;i<l;i++)
		{
			if(S1.charAt(i)==S2)
			{
			  n++;
			}
		}
		System.out.print("The character is present in the String "+n+" times");
	}
}
