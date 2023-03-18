package algorithms.sorting.quicksort;

import algorithms.sorting.selectionsort.SelectionSort;

public class Test {
public static void main(String[] args) {
	
	int [] arr={2,3,4,1,4,0,0,120,5};
	for(int x:arr) {
		System.out.print(x+"**");
	}
	QuickSort.sort(arr, 0, 8);
	for(int x:arr) {
		System.out.print(x);
	}
}
}
