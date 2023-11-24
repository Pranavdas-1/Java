import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		int small,i,j=0;
		System.out.print("Enter the String to checked  :- ");
		Scanner add=new Scanner(System.in);
		String S1=add.nextLine();
		int l=S1.length();
		String S2;
		S2="";
		for(i=l-1;i>=0;i--)
		{			
				S2=S2+S1.charAt(i);
		}		
		if(S1.compareTo(S2)==0)
		{
			System.out.print("The String is a Palindrome");
		}
		else
		{
			System.out.print("The String not a Palindrome");
		}
	}
}
