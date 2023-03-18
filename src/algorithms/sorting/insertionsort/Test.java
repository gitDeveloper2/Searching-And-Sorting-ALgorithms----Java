package algorithms.sorting.insertionsort;

public class Test {
public static void main(String[] args) {
	InsertionSort insertionSort=new InsertionSort();
	int [] arr={1,5,4,2,90,30,1,32};
	
	for(int x:insertionSort.sort(arr)) {
		System.out.print(x);
	}
}
}
