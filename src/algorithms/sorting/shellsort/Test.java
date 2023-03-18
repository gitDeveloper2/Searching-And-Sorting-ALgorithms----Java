package algorithms.sorting.shellsort;

import algorithms.sorting.insertionsort.InsertionSort;

public class Test {
	public static void main(String[] args) {
		ShellSort shellSort=new  ShellSort();
		int [] arr={1,5,4,2,90,30,1,32};
		
		for(int x:shellSort.sort(arr)) {
			System.out.print(x);
		}
	}
	
}
