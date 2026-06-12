package arrays;

public class PeakElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,6,2,5,7};
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				System.out.println("Peak Index :"+i);
				System.out.println("Peak Element:"+ arr[i]);
				break;
			}
		}

	}

}
