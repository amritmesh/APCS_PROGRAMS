import java.util.ArrayList;

public class SortSearchMethods 
{
	/*
	 * Selection Sort
	 * Find the smallest element in the array and swap it with the zero element
	 * Find the next smallest and swap with the one elememt
	 * Continue until you get to the last element
	 */	
	
	public static ArrayList<String> selectionSort(ArrayList<String> a) {
		int min;
	
		for (int outer = 0; outer < a.size() - 1; outer++) {
			min = outer; // set the minimum to current index
			// find the minimum in the rest of the list starting
			// with outer + 1
			for (int inner = outer + 1; inner < a.size(); inner++) {
				if (a.get(inner).compareTo(a.get(min)) < 0) {
					min = inner; // store index of minimum
				}
			}
			// swap the minimum with the current value
			String temp = a.get(outer);
			a.set(outer, a.get(min));
			a.set(min, temp);
		}
		return a;
	}

	/*
	 * Insertion Sort
	 * We insert sequential elements in an ordered list
	 * after each iteration in the outer loop outer number 
 * of elements are sorted in the first outer elements 
	 * of the list.  
 * For example when outer = 5, we insert it in the right spot of the first 4 elements 
 * Now the first 5 elements are in order
	 * Continue until you get to the last element
	 */	
	
	
	public static ArrayList<String> insertionSort(ArrayList<String> a) {
		for (int outer = 1; outer < a.size(); outer++) {
			int position = outer;
			String key = a.get(position);
			// Shift larger values to the right
			while (position > 0 && a.get(position - 1).compareTo(key) > 0) {
				a.set(position, a.get(position - 1));
				position--;
			}
			//insert the element in the correct position
			a.set(position, key);
		}
		return a;
	}



	/*
	 * Linear or Sequential Search
	 * we traverse through the list one element at a time to find
	 * returns the index of lookfor in ArrayList a
	 * return -1 if not found
	 */	
	public static int linearSearch(ArrayList<String> a, String lookFor) {
		for (int i = 0; i < a.size(); i++) {
			if (lookFor.equals(a.get(i))) {

				return i;
			}
		}

		return -1;

	}

	/*
	 * Binary Search 
	 * List must be in order for this to work.
	 * we compare lookfor to the middle element of the list. If found stop.  E
	 * Else decide which half of the list lookfor is in and compare to the
	 * middle of that half. Continue until it is found or the next half has no
	 * elements (not found) 
	 * returns the index of lookfor in ArrayList a 
	 * return -1 if not found
	 */	
	public static int binarySearch(ArrayList<String> a, String lookfor) {
		//the list must be sorted for BinarySearch to work
		selectionSort(a);
		int low = 0;
		int high = a.size() - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2; 

			if (a.get(mid).equals(lookfor)) {
				return mid;
			} else if ((lookfor.compareTo(a.get(mid)) > 0)) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	
	/**
	 * Recursively finds the index number of lookFor in an array using Binary Search
	 * 
	 * @param arr. arr must be ordered for the algorithm to work
	 * @return the index number of lookFor. -1 if not found
	 */
	
	
	public static int binarySearchRecursive(ArrayList<String> arr, String lookFor) {
		return binarySearchRecursive(arr, lookFor, 0, arr.size() - 1);
	}

	static int binarySearchRecursive(ArrayList<String> arr, String lookFor, int start, int end) {

		// int mid = (start+end) /2;// this can overflow for values near
		// Integer.Max: can be solved by start + (end-start) / 2;
		int mid = start + (end - start) / 2;;
		
	
	 if (arr.get(mid).equals(lookFor))
			 	return mid;
	 else if (start >= end)
			return -1;
		 
		else if (lookFor.compareTo(arr.get(mid))<0)
			return binarySearchRecursive(arr, lookFor, start, mid - 1);
		else 
			return binarySearchRecursive(arr, lookFor, mid + 1, end);
	}

	/*
	 * Merge Sort Recursive
	 * 
	 * Split the list in 2 halves. Sort each half. (Sort by calling recursively)
	 * Merge back to 1 list by traversing through each half as we decide what to add
	 * to a new List. Stop at the end of each half.
	 * 
	 * returns the sorted ArrayList
	 * 
	 */		
	public static ArrayList<String> mergeSort(ArrayList<String> whole) {
	    ArrayList<String> left = new ArrayList<String>();
	    ArrayList<String> right = new ArrayList<String>();
	    int center;
	 
	    if (whole.size() == 1) {    
	        return whole;
	    } else {
	        center = whole.size()/2;
	        // copy the left half of whole into the left.
	        for (int i=0; i<center; i++) {
	                left.add(whole.get(i));
	        }
	 
	        //copy the right half of whole into the new arraylist.
	        for (int i=center; i<whole.size(); i++) {
	                right.add(whole.get(i));
	        }
	 
	        // Sort the left and right halves of the arraylist.
	        left  = mergeSort(left);
	        right = mergeSort(right);
	 
	        // Merge the results back together.
	        merge(left, right, whole);
	    }
	    return whole;
	}
//	The merge method for merging the N sublists into a sorted list.


private static void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
	    int leftIndex = 0;
	    int rightIndex = 0;
	    int wholeIndex = 0;
	 
	    // As long as neither the left nor the right ArrayList has
	    // been used up, keep taking the smaller of left.get(leftIndex)
	    // or right.get(rightIndex) and adding it at both.get(bothIndex).
	    while (leftIndex < left.size() && rightIndex < right.size()) {
	        if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
	            whole.set(wholeIndex, left.get(leftIndex));
	            leftIndex++;
	        } else {
	            whole.set(wholeIndex, right.get(rightIndex));
	            rightIndex++;
	        }
	        wholeIndex++;
	    }
	 
	    ArrayList<String> rest;
	    int restIndex;
	    if (leftIndex >= left.size()) {
	        // The left ArrayList has been use up...
	        rest = right;
	        restIndex = rightIndex;
	    } else {
	        // The right ArrayList has been used up...
	        rest = left;
	        restIndex = leftIndex;
	    }
	 
	    // Copy the rest of whichever ArrayList (left or right) was not used up.
	    for (int i=restIndex; i<rest.size(); i++) {
	        whole.set(wholeIndex, rest.get(i));
	        wholeIndex++;
	    }
	}
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jones");
		names.add("Patel");
		names.add("Abbas");
		names.add("Wong");
		names.add("Yu");
		names.add("Connolly");
		names.add("Rao");
		names.add("Garcia");
		System.out.println(mergeSort(names));
		System.out.println("Find the index of Garcia using Linear Search");
		System.out.println(linearSearch(names, "Garcia"));
		System.out.println("Find the index of Daly using Linear Search");
		System.out.println(linearSearch(names, "Daly"));
		System.out.println("Find the index of Garcia using Binary Search");
		System.out.println(binarySearch(names, "Garcia"));
		System.out.println("Find the index of Daly using Binary Search");
		System.out.println(binarySearch(names, "Daly"));
		System.out.println("Find the index of Wong using Recursive Binary Search");
		System.out.println(binarySearchRecursive(names, "Wong")); 
	}
}
