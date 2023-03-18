package algorithms.sorting.selectionsort;

import algorithms.sorting.insertionsort.InsertionSort;

public class Test {
	public static void main(String[] args) {
		SelectionSort selectionSort=new SelectionSort();
		int [] arr={1,5,4,2,90,30,1,32};
		
		for(int x:selectionSort.sort(arr)) {
			System.out.print(x);
		}
	}
	
}
