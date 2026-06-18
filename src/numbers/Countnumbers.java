package numbers;

public class Countnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =-121;
		 
		int org=num;
		int rev=0;
		
		
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			
			
		}
		
		if(org==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
