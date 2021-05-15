package Array;

import GCD.Euclidean;

public class Juggling {
	
	public static void leftRotate(int arr[], int d, int n) {
        d = d % n; 
        int i, j, k, temp; 
        int g_c_d = Euclidean.euclidean(d, n); 
        for (i = 0; i < g_c_d; i++) {
            temp = arr[i]; 
            j = i;
            while (true) { 
                k = j + d; 
                if (k >= n) 
                    k = k - n; 
                if (k == i) 
                    break; 
                arr[j] = arr[k]; 
                j = k; 
            } 
            arr[j] = temp; 
        } 
    }
}
