package searching;

public class BinarySearch {
	
	public static int recursive(int[] arr, int l, int r, int x) {
		
		if (r >= l) { 
	        int mid = l + (r - l) / 2; 
	  
	        if (arr[mid] == x) 
	            return mid; 
	        
	        if (arr[mid] > x) 
	            return recursive(arr, l, mid - 1, x); 
	  
	        return recursive(arr, mid + 1, r, x); 
	    }
		
		return -1;
	}
	
	public static int iterative(int arr[], int l, int r, int x) {
		
		while (l <= r) { 
	        int m = l + (r - l) / 2; 
	   
	        if (arr[m] == x) 
	            return m; 
	  
	        if (arr[m] < x) 
	            l = m + 1; 
	  
	        else
	            r = m - 1; 
	    }
		
		return -1; 
	}
	
}
