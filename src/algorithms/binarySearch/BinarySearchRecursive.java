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
public class BinarySearchRecursive {

    static int rounds = 0;

    public void search(int[] arr,int first, int last, int key) {
        int midPoint=first + (last-first)/2;
        
        if(first>=last){
             System.out.println("Element not found");
            return;
        }
        if(key==arr[midPoint]){
            System.out.println("Element found");
            return;
        }else if(key>arr[midPoint]){
            search(arr,midPoint+1,last,key);
        }
        else{
            search(arr, first, midPoint-1, key);
        }

    }

    private void printArray(int[] arr) {
        System.out.println("");
        for (int element : arr) {
            System.out.println(element);
        }
        System.out.println("");

    }
}
