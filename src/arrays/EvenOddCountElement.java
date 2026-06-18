package arrays;

public class EvenOddCountElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {3,2,4,7,9};
		
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				evencount++;
				System.out.println("even numbers"+arr[i]);
			}else {
				System.out.println(arr[i]);
				oddcount++;
			}
		}
		System.out.println("even count"+evencount);
		System.out.println("odd count"+oddcount);
	}

}
