package Array;

public class NextPermutation {
	public static void nextPermutation(int[] A) {
		if(A==null||A.length<=1) return;
		int i = A.length-2;
		while(i>=0 && A[i]>=A[i+1])i--;
		if(i>=0) {
			int j=A.length-1;
			while(A[j]<=A[i])j--;
			swap(A,i,j);
		}
		reverse(A,i+1,A.length-1);
	}

	private static void reverse(int[] A, int i, int j) {
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
		
	}

	private static void swap(int[] A, int i, int j) {
		while(i<j) {
			int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
		}
		
	}
}
