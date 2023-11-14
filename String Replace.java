import java.util.*;
class replace
{
	public static void main(String args[])
	{
		int i,n=0;
		System.out.print("Enter the String :- ");
		Scanner add=new Scanner(System.in);
		String S1=add.nextLine();
		System.out.print("Enter the character to be replaced  :- ");
		char S2=add.next().charAt(0);
		System.out.print("Enter the character to which it is to be replaced  :- ");
		char S3=add.next().charAt(0);
		String S4="";
		int l=S1.length();
		S4=S1.replace(S3,S2);
		System.out.print("the new string is :- "+S4);
	}
}
