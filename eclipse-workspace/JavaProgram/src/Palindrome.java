
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "radar";
		String rev= "";
		for(int i=str.length()-1; i>=0 ; i--)
			rev=rev+str.charAt(i);
		if(str.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		

	}

}
