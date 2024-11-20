package arrays;

public class Q5_NegativePositiveOneSide {
	
	public static void NegPos(int[] a) {
		
		int []t = new int[a.length]; 
	     int j = 0 ; 
		for(int i = 0 ; i < a.length ; i++) {
			if(a[i] > 0 ) {
				t[j ++] = a[i]; 
			
			}
		}
			for(int  i = 0 ; i < a.length ; i++) {
				if(a[i] < 0 ) {
					t[j++] = a[i]; 
				}
			}
		
		for(int  i = 0 ; i < a.length ; i++) {
			a[i] = t[i]; 
		}
	}
	public static void main(String[] args) {
		
		int []arr = {-1,0,-8,9,-8,9,-7} ; 
		
		NegPos(arr);
		for(int  i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
