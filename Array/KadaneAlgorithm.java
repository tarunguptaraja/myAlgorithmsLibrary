package Array;

public class KadaneAlgorithm {
	
	public static int maxSumArray(int[] arr) {
		int maxSum=Integer.MIN_VALUE, currSum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			currSum+=arr[i];
			
			if(maxSum<currSum) maxSum=currSum;
			
			if(currSum<0) currSum=0;
		}
		
		return maxSum;
	}

}
