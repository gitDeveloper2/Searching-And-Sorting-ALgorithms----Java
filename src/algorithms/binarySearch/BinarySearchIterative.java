/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.binarySearch;

/**
 *
 * @author developer
 */
public class BinarySearchIterative {

  

    private final int[] arr;
BinarySearchIterative(int [] arr){
    this.arr=arr;
    printArray();
}
    public String search(int key) {
       int first=0;
       int last =arr.length-1;
       int midPoint;
       int round=0;
        while(last>=first){
            
            midPoint=first + (last - first)/2; //start + (end - start)/2
            if(arr[midPoint]==key){
                return "ELement found at index "+midPoint;
            }
            if(key<arr[midPoint]){
                
                last=midPoint-1;
            }
             if(key>arr[midPoint]){
               
                first=midPoint+1;
            }
        }
       
        String result="Element not found";
        return result;
    }
    
      private  void printArray() {
            System.out.println("");
          for(int element: this.arr){
              System.out.print(element);
    }
          System.out.println("");
    
}
}