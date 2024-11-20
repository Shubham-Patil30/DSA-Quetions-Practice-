package arrays;

public class Q8_MaxSubArray_kaganeAlgo {
	//================== Kagane Algorithm =================
	public static void maxSubArraySum(int[] a ) {
	int	maxSum= a[0];
	int currSum = a[0]; 
		
	for(int i =1; i<a.length ; i++) {
		if(currSum >= 0) {
			currSum = currSum + a[i]; 
		}
		else {
			currSum = a[i]; 
		}
		if(currSum > maxSum) {
			maxSum = currSum; 
		}
			}
	System.out.println("Maxsum: "+maxSum);

	}

	public static void main(String[] args) {
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; 
		maxSubArraySum(arr);
		

	}

}
