package algorithms.sorting.quicksort;

public class QuickSortUnclearVersion {

	public static void sort(int[] arr,int first, int last) {
		if(first<last) {
			int pivot=partition(arr,first,last);
			sort(arr,first,pivot-1);
			sort(arr,pivot +1,last);
		}
	
	}

	public static int partition(int[] arr, int first, int last) {
	
		int pivot=first;//find a pivot element with function properly
		int border=first+ 1;//border represents a pivot, all elements left are small, all right are big. 
		//swap pivot with first or last element. The pivot should go to the first element. 
		//for our case the pivot is the first element so no swapping
//		swap(arr,pivot,border);
		for(int i=border;i<arr.length;i++) {
			if(arr[i]<arr[pivot]) {
				swap(arr,i,border++);
				printArray(arr,border,pivot,i);
			}else {
				System.out.println("skipped");
			}
		}
		swap(arr,border-1,pivot);
		System.out.println("returned with border="+(border-1)+"nd pivot="+pivot);
		return border-1;
	}

	public static void swap(int[] arr, int first, int border) {
		int temp=arr[first];
		arr[first]=arr[border];
		arr[border]=temp;
		
		
	}
	public static  void printArray(int [] arr,int border,int pivot,int i) {
        System.out.println("");
      for(int element: arr){
          System.out.print(element +"**");
}
      System.out.println(" ---border: "+border+"--pivot "+pivot+"--i "+i);
      System.out.println("");

}

}
