package arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,4,6};
		
		int n=arr.length+1;
		
		//array sum first
		int arraysum=0;
		for(int i=0;i<arr.length;i++) {
			arraysum=arraysum+arr[i];
		}
		
		//total actual array sum 
		int totalsum=0;
		
//	  1)   totalsum=n*(n+1)/2;
		
		for(int i=1;i<=n;i++) {
			totalsum=totalsum+i;
}
	     
	     int missing= totalsum-arraysum;
	     
	     System.out.println("missing number is : "+missing);
		
		
	}

}
