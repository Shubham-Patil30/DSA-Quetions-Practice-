package arrays;

import java.util.Arrays;

public class KthMaxMin {
	 
//	public static void kthMax(Integer[] a , Integer k ) {
//		Arrays.sort(a.Collections.reverseOrder());
//		int max = a[k-1];
//		System.out.println(k+"th Max :"+max);
//	}
	
	public static void kthMin(Integer[] arr , int k ) {
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}

	public static void main(String[] args) {

		Integer[]  arr= {1,8,3,4} ; 
		KthMaxMin.kthMin(arr, 2);
	}

}
