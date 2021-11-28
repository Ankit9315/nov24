package nov22;
import java.util.Scanner;
public class searchword {
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		String a="";	
		System.out.println("Enter the sentence :");
		a=sc.nextLine();
		String b="";	
		System.out.println("Enter the word to be searched : (Remember Java is Case Sensitive!!)");
		b=sc.nextLine();
		int c=a.indexOf(b);
		if(c==-1)
			System.out.println("Word not found!");
		else
			System.out.println("Word found at index : "+c);
	}
}
