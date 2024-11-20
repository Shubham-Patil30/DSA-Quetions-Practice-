package arrays;

public class Q7_RotateArray {
	
	// ============ Method 1 ===============
	public static void rotateArrayByOne(int[] a) {
		int x = a[0]; 
		
		for(int i =1 ; i<a.length; i++ ) {
		 a[i-1] = a[i];
		}
		a[a.length-1] = x  ; 
	}
	// ============ Method 2 =============== TC: O(k*n) 
	public static void rotate(int[] a , int k ) {
		k = k%a.length; 
		if(k<0) {
			k=k+a.length; 
		}
		for(int i =1; i<=k; i++) {
			rotateArrayByOne(a);
		}
	}
	// ============ Method 3  =============== TC: O(n) 
	
	public static void reverse(int[] a, int start , int end ) {
		 
		while(start<end) {
			int x = a[start];
			a[start] = a[end];
			a[end] = x; 
			start++;
			end--; 
		}
		
	}
	
	public static void reverseArrayByK(int[] a, int k ) {
		 k = k%a.length; 
		 if(k <0) {
			 k = k+a.length;
		 }
		 reverse(a, 0, k-1);
		 reverse(a, k, a.length-1);
		 reverse(a, 0, a.length-1);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5} ;
//		rotateArrayByOne(arr);
		
//		rotate(arr, -3);
		
		reverseArrayByK(arr, 5);
		for( int i = 0 ; i<arr.length ;i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
