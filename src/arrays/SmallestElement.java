package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {40,20,10,60};
		
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
