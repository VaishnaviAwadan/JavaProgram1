import java.util.
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145, rev=0;
		while(n!=0)
		{
		 int rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		}
		  System.out.println("Reverse number is:" +rev);
		 
		 
		 
			
		}
	}
