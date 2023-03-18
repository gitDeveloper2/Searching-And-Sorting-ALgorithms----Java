package algorithms.sorting.bubblesort;

public class Test {
public static void main(String[] args) {
	 int [] arr={1,5,4,2,90,30,32};
	 BubbleSort bubbleSort=new BubbleSort();
	
	 for(int x: bubbleSort.sort(arr)) {
		 System.out.print(x);
	 }
}
}
