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
	public int[] sort(int[] arr,int first, int last) {

		if (last==first) {
			int [] br=new int[1];
			br[0]= arr[first];
			return br;
		}
		
		int midPoint = (first + last) / 2;

		int[] left = sort(arr,first, midPoint);
		
		int[] right = sort(arr,midPoint+1,last);
	
		return merge(left, right);
	}

	public int[] merge(int[] left, int[] right) {
	

		int i = 0;
		int j = 0;
		int k = 0;
		int[] sortedAray = new int[left.length + right.length];

		while (i <= left.length-1 && j <= right.length-1) {
			
			if (left[i] <= right[j]) {
			
				sortedAray[k++] = left[i++];
				
			}
			else if (left[i] > right[j]) {
				
				sortedAray[k++] = right[j++];
			}
			
		}
		while(i<left.length) {
			sortedAray[k++]=left[i++];
		}
		while(j<right.length) {
			sortedAray[k++]=right[j++];
		}
		

		
		return sortedAray;
	}

	public void printArray(int[] arr) {

		for (int element : arr) {
			System.out.print(element);
		}


	}

}
