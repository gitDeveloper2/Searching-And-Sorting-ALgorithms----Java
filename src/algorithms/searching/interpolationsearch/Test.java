package algorithms.searching.interpolationsearch;

public class Test {
	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,9};
		InterpolationSearch interpolationSearch=new InterpolationSearch();
		System.out.println(	interpolationSearch.search(arr,arr.length,9 ));
	}
}
