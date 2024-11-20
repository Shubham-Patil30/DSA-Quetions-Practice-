package arrays;

public class MaxMinArray {
    public static void findMaxMin(int[] arr) {
    	int max , min ; 
    	if(arr[0] > arr[1]) {
    		max = arr[0];
    		min = arr[1];
    	}
    	else {
    		max=arr[1];
    		min=arr[0]; 
    	}
    	for(int i =0; i <arr.length ; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    		}
    		else if(arr[i] < min) {
    			min = arr[i];
    		}
    	}
    	System.out.println("Min:"+min+ "," +"Max:"+max );
    }
	public static void main(String[] args) {
		int[] arr1 = {1,8,10,2,8,9,0,88};
		MaxMinArray.findMaxMin(arr1);
	}

}
