package arrays;

import java.util.ArrayList;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,3,2,3,4,5};
		
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for(int i=0;i<arr.length;i++) {
		int count=0;
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[i]==arr[j]) {
				count++;
			}
			
		}
		if(count>1 && !list.contains(arr[i])) {
			list.add(arr[i]);
		}
	}
		
	if(list.isEmpty()) {
		list.add(-1);
	}
	
	System.out.println(list);
	}

}
