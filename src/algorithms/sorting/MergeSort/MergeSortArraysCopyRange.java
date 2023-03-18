package algorithms.sorting.MergeSort;

import java.util.Arrays;

public class MergeSortArraysCopyRange {
public int [] sort(int [] arr) {
	if(arr.length==1) {
		return arr;
	}
	int midPoint=arr.length/2;
	int [] left=Arrays.copyOfRange(arr, 0, midPoint);
	int [] right=Arrays.copyOfRange(arr, midPoint, arr.length);
	return merge(left,right);
}
	
	public int[] merge(int[] left, int[] right) {
	int i=0;
	int j=0;
	int k=0;
	int [] sortedArray=new int [left.length+right.length];
	
	while(i<left.length && j<right.length) {
		if(left[i]<=right[j]) {
			sortedArray[k++]=left[i++];
			
		}else if(left[i]>right[j]){
			sortedArray[k++]=right[j++];
			
		}
			
	}
	
	while(i<left.length) {
		
		sortedArray[k++]=left[i++];
	}
	while(j<right.length) {
	
		sortedArray[k++]=right[j++];
	}
	
	return sortedArray;
}

	public void printArray(int[] arr) {

		for (int element : arr) {
			System.out.print(element);
		}


	}
}
