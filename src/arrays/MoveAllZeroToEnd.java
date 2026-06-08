package arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {2,6,0,5,0,8};
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		
		while(index<arr.length) {
			arr[index]=0;
			index++;
		}
		
		System.out.println("Arrays after moving zero to end.");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}

}
