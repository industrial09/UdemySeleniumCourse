package usefulScripts;

import java.util.HashMap;
import java.util.Map.Entry;

public class UsefulScriptsWithLogarithms {
	//Method to get first and second smallest value in an array
	public void getFirstAndSecondSmallestValueFromArray(int[] arr) {
		int first, second;
		first= second = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]< first) {
				second = first;
				first = arr[i];
			}else if(arr[i] < second && arr[i] != first) {
				second = arr[i];
			}
		}
	}
	
	//Method to get the missing value in an array
	public void findMissingElementOnArray(int[] arr) {
		//1st. Find the sum of following formula (x):
		// n = number of elements in array
		// n = n*(n+1)/2
		int n = arr.length;
		n = n*(n+1)/2;
		
		//2nd. Find the sum of elements present in the array (y)
		int sum=0;
		for(int i: arr) {
			sum+= arr[i];
		}
		
		//3. Missing value is the Substract result between sum of elements present in the array(y) - the sum of following formula (x)
		int missingValue = sum - n;
		System.out.println("Misisng value in array is: "+ missingValue);
	}
	
	//Method to get the 2nd greater value in an array
	public void getSecondGreaterValueFromArray(int[] arr) {
		int highest, secondHighest;
		highest= secondHighest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> highest) {
				secondHighest = highest;
				highest = arr[i];
			}else if(arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		
		System.out.println("Second highest value in array is: "+secondHighest);
	}
	
	//Metohd to get odd number for repeated values in an array
	public int getOddNumberOfValuesInAnArray(int[] arr) {
		HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length;i++) {
			int element = arr[i];
			if(elements.get(element) == null) {
				elements.put(element, 1);
			}
			else elements.put(element, elements.get(element) +1);
		}
		
		for(Entry<Integer, Integer> data: elements.entrySet()) {
			if(data.getValue() %2 == 1) {
				return data.getKey();
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
		/*int[] arr = {76, 34, 89, 56, 21};
		 * 
		 * Example of Array for finding a missing element in an array
		 * int[] arrMssingEl = {1, 2,3,4,6,7,8,9,10};
		 * int[] arrMssingEl = {1, 2,2,3,1,4,3,4,1,2};
		
		UsefulScriptsWithLogarithms useful = new UsefulScriptsWithLogarithms();
		useful.getFirstAndSecondSmallestValueFromArray(arr);
		useful.findMissingElementOnArray(arrMssingEl)
		useful.getSecondGreaterValueFromArray(arrMssingEl)
		useful.getOddNumberOfValuesInAnArray()*/
	}
}
