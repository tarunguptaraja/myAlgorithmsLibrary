package GCD;

public class Euclidean {

	public static int euclidean(int a, int b){ 
        if (a == 0) 
            return b; 
          
        return euclidean(b%a, a); 
    }
}
