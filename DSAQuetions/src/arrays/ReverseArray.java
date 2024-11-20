package arrays;

public class ReverseArray {
	
	public static void reverseArray(int a[] ){
	      	int i = 0 ; 
	      	int j = a.length-1; 
	      while(i<=j)	{
	      int 	s= a[i] ; 
	      a[i] = a[j]; 
	      a[j] = s;
	      i++; 
	      j--; 
	      }
	      	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr= {1,2,3,4} ; 
	 ReverseArray.reverseArray(arr);
		
		for( int i =0 ; i<= arr.length-1; i++) {
			System.out.println(arr[i]);
		}

	}

}
