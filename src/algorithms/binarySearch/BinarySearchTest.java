/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.binarySearch;

import java.util.Arrays;

/**
 *
 * @author developer
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        BinarySearchRecursiveCopyRangeFXN search = new BinarySearchRecursiveCopyRangeFXN();
        search.search(arr, 4);
//        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
//        binarySearchRecursive.search(arr,0,arr.length-1,2);
//        BinarySearchIterative binarySearch=new BinarySearchIterative(arr);
//        String result=binarySearch.search(3);
//        System.out.println(result);
    }
}
