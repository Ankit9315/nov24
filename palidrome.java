package nov22;

import java.util.Scanner;

public class palidrome {
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		String a="";	
		System.out.println("Enter the word :");
		a=sc.nextLine();
		char[] arr=a.toCharArray();
		String s="";
    for(int i=(arr.length)-1;i>=0;i--)
		{
			s=s+arr[i];
		}
		System.out.println("Reversed String : "+s);
    
		if(a.equalsIgnoreCase(s))
			System.out.println(a+" - is a palindrome!!");
		else
			System.out.println(a+" - is not a palindrome!!");
	}
}
