package algorithms.sorting.quicksort;

public class QuickSort {
public static void sort(int [] arr, int first, int last) {
	
	if(first<last) {
	int pivot=partition(arr,first,last);
	sort(arr,first,pivot-1);
	sort(arr,pivot+1,last);
	}
}

private static void swap(int[] arr, int pivot, int last) {
int temp=arr[pivot];
arr[pivot]=arr[last];
arr[last]=temp;
	
}

private static int partition(int[] arr, int first, int last) {
	int pivot=getPivot(first,last);
	swap(arr,pivot,last);
	int pivotIndexCounter=first;
	for(int i=first;i<last;i++) {
		if(arr[i]<arr[last]) {
			swap(arr,pivotIndexCounter,i);
			pivotIndexCounter++;
		}
	}
	swap(arr,pivotIndexCounter,last);
	return pivotIndexCounter;
}

private static int getPivot(int first, int last) {

	return (first+last)/2;
}
}
