/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.MergeSort;

/**
 *
 * @author developer
 */
public class Test {
    public static void main(String[] args) {
        MergeSortArraysCopyRange mergeSort=new MergeSortArraysCopyRange();
//        int [] testArray1= {1,5,6,60};
//        int [] testArray2= {1,1,2,3,7,40};
//        int [] result=mergeSort.merge(testArray1, testArray2);
//        mergeSort.printArray(result);
        
        int [] arr={1,5,4,2,90,30,32};
       int [] result=mergeSort.sort(arr);
    	 mergeSort.printArray(result);
    }
    
    
}
