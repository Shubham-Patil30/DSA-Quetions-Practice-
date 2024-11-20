package arrays;

public class Q11_RemoveDupsFrmArray {

	public static int removeDups(int[] ar) {
		int rd = 0 ; 

		
		for(int i =1 ; i<ar.length ; i++) {
			if(ar[rd] != ar[i]) {
				rd++;
				ar[rd] = ar[i];
			}
		
		}
		return rd + 1; 
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4};
		
		int rd = removeDups(arr);
		for (int i =0 ; i<rd;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	}


