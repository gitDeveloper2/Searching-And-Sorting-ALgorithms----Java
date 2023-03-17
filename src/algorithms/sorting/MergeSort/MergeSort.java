/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting.MergeSort;

import java.util.Arrays;

/**
 *
 * @author developer
 */
public class MergeSort {
    public int [] sort(int [] arr){
        
        if(arr.length==1){
            System.out.println("End reached");
            return arr;
        }
        int first=0;
        int last=arr.length-1;
        int midPoint=(first+last)/2;
        
        int[] left=sort(Arrays.copyOfRange(arr, first, midPoint));
        System.out.println("reached here");
        printArray(arr);
        int[] right=sort(Arrays.copyOfRange(arr, midPoint, last+1));
        System.out.println("Now reached here");
        System.out.print("left : "+left.length);
        System.out.print("right : "+left.length);
        return merge(left,right);
    }

    private int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int [] sortedAray=new int [left.length+right.length];
        while(i<=left.length && j<=right.length){
            if(left[i]<=right[j]){
                sortedAray[k++]=left[i++];
            }else if (right[j]>=left[i]){
                sortedAray[k++]=right[j++];
            }
        }
        while(i<left.length){
            sortedAray[k++]=left[i++];
        }
         while(j<left.length){
            sortedAray[k++]=left[j++];
        }
         return sortedAray;
    }
 private void printArray(int[] arr) {
        System.out.println("");
        for (int element : arr) {
            System.out.print(element);
        }
        System.out.println("");

    }
    
}
