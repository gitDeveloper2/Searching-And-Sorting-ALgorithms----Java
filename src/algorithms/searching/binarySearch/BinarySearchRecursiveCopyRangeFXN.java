/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.searching.binarySearch;

import java.util.Arrays;

/**
 *
 * @author developer
 */
public class BinarySearchRecursiveCopyRangeFXN {
        public void search(int[] arr, int key) {
          
            int first=0;
            int last=arr.length-1;
            int midPoint=(last+first)/2;
            if(last-first==-1){
                System.out.println("Element not found");
                return;
            }
       if(key==arr[midPoint]){
           System.out.println("Element found");
           return;
       }
       if(key>arr[midPoint]){
          
           int [] tempArr=Arrays.copyOfRange(arr, midPoint+1, last+1);
//           printArray(tempArr);
           search(tempArr, key);
       }else{
          
           int [] tempArr=Arrays.copyOfRange(arr, first,midPoint);
//           printArray(tempArr);
           search(tempArr, key);
       }
    }

    private void printArray(int[] arr) {
        System.out.println("");
        for (int element : arr) {
            System.out.print(element);
        }
        System.out.println("");

    }
}
