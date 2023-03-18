package algorithms.sorting.shellsort;

public class ShellSort {
	public int[] sort(int[] arr) {
		for(int gap=arr.length/2;gap>0;gap/=2) {
		for(int i=gap;i<arr.length;i++) {
		int j=i;
		while(j>=gap && arr[j-1]>arr[j]) {
			int temp=arr[j];
			arr[j]=arr[j-gap];
			arr[j-gap]=temp;
			j-=gap;
		}
			
			
		}}
		return arr;
	}
	
	public void printArray(int[] arr) {

		for (int element : arr) {
			System.out.print(element);
		}


	}
}
