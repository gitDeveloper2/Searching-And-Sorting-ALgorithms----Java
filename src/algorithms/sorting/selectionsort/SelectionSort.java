package algorithms.sorting.selectionsort;

public class SelectionSort {

	public int[] sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			int minimumElement=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minimumElement]) {
					minimumElement=j;
				}
			}
			
			if(minimumElement!=i) {
			
			int temp=arr[i];
			arr[i]=arr[minimumElement];
			arr[minimumElement]=temp;
			
			}
		}
		return arr;
	}

}
