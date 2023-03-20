package algorithms.searching.interpolationsearch;

public class InterpolationSearch {
public int search(int a[], int n, int key) {
	
	 int low = 0, high = (n - 1); 
	  while (low <= high && key >= a[low] && key <= a[high]) 
	 
	   { 
	      if (low == high) 
	     { 
	        
	      if (a[high] == key)
	        return 1; 
	    
	         else
	         return -1;
	      
	     } 
	    
	    int position = low + (((high-low) / (a[high]-a[low]))*(key - a[low])); 
	 
	    if (a[position] == key) 
	      {
	          return 1; 
	      }
	     
	    else if (a[position] < key) 
	      {
	          low = position + 1;
	      }
	     
	    else if(a[position] > key)
	      {
	          high = position - 1;
	      }
	  } 
	  
	  return -1; 
			
	
	
}
}
