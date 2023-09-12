// Object oriented programming in java:

// 1. Write a Java program to read and print elements of array.
// Ans: 
public class PrintArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
// output: 
// Elements of given array: 
// 1 2 3 4 5 

// 2. Write a Java program to print all negative elements in an array.
// ans:
public class NegativeArrayItems {
	
	public static void main(String[] args) {
		int j = 0;
		int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
		
		
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		while(j < Neg_arr.length) 
		{
			if(Neg_arr[j] < 0) {
				System.out.format("%d ", Neg_arr[j]);
			}
			j++;
		}
	}
}
// output:
// List of Negative Numbers in NEG Array : -40 -4 -8 -13 -11 -99 -60

// 3.Write a Java program to find sum of all array elements. 
// Ans:
public class SumOfArray {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
} 
// output:
// Sum of all the elements of an array: 15

// 4. Write a Java program to find maximum and minimum element in an array. 
// Ans:
public class MaxMin {
  public static void main(String[] args) {
    // Declare and initialize array with elements
    int[] arr = {3, 4, 5, 9, 1, 4, 6, 7, 2};

    // Initialize variable to hold the maximum and minimum values
    int max = arr[0];
    int min = arr[0];

    // Loop the array
    for(int i = 1; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
    }
    System.out.println("Maximum element: " + max);
    System.out.println("Minimum element: " + min);
  }
}

/*
  Output is: 
  Maximum element: 9
  Minimum element: 1
*/
//  5. Write a Java program to find second largest element in an array.

public class SecondLargest {
    public static void main(String[] args) {
        // Declare and initialize an array with elements
        int[] arr = { 3, 9, 1, 7, 5, 2, 8, 4, 6 };

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest != largest) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}
/*
  Output is:
  Second largest element: 8 
*/
// 6. Write a Java program to count total number of even and odd elements in an array.

public class EvenOddCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}

/*
Total even numbers: 5
Total odd numbers: 5
*/
// 7. Write a Java program to count total number of negative elements in an array.

public class NegativeElementCounter {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        
        int negativeCount = 0;
        
        for (int number : numbers) {
            if (number < 0) {
                negativeCount++;
            }
        }
        
        System.out.println("Total negative numbers: " + negativeCount);
    }
}
// output:
// Total negative numbers: 5

// 8. Write a Java program to copy all elements from an array to another array.

public class ArrayCopy {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        
        // Copy elements from sourceArray to destinationArray
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        // Print the contents of destinationArray
        System.out.print("Contents of destinationArray: ");
        for (int value : destinationArray) {
            System.out.print(value + " ");
        }
    }
}

/*
Contents of destinationArray: 1 2 3 4 5 
*/
// 9. Write a Java program to insert an element in an array.

public class ArrayInsertionExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToInsert = 10;  // The element to insert
        int insertPosition = 2;     // The position at which to insert the element

        int[] newArray = new int[originalArray.length + 1];  // Create a new array with one more element

        // Copy elements from the original array to the new array, inserting the new element
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == insertPosition) {
                newArray[i] = elementToInsert;  // Insert the new element
            } else {
                newArray[i] = originalArray[j++];
            }
        }

        // Print the contents of the new array
        System.out.print("Contents of newArray: ");
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}

/*
Contents of newArray: 1 2 10 3 4 5 
*/
// 10.Write a Java program to delete an element from an array at specified position.

import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positionToDelete = 2; // Specify the position to delete (0-based index)

        if (positionToDelete < 0 || positionToDelete >= arr.length) {
            System.out.println("Invalid position to delete.");
        } else {
            // Create a new array one element smaller than the original array
            int[] newArray = new int[arr.length - 1];

            // Copy elements before the specified position
            for (int i = 0; i < positionToDelete; i++) {
                newArray[i] = arr[i];
            }

            // Copy elements after the specified position
            for (int i = positionToDelete; i < newArray.length; i++) {
                newArray[i] = arr[i + 1];
            }

            // Update the original array reference to point to the new array
            arr = newArray;

            System.out.println("Array after deleting element at position " + positionToDelete + ": " + Arrays.toString(arr));
        }
    }
}
// output:
// Array after deleting element at position 2: [1, 2, 4, 5]

// 11. Write a Java program to count frequency of each element in an array


import java.util.HashMap;
import java.util.Map;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 5};
        
        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array
        for (int element : array) {
            // If the element is already in the map, increment its count
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                frequencyMap.put(element, 1);
            }
        }
        
        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
// output:
// Element 1 occurs 2 times
// Element 2 occurs 3 times
// Element 3 occurs 2 times
// Element 4 occurs 3 times
// Element 5 occurs 1 times

// 12.Write a Java program to print all unique elements in the array

import java.util.HashSet;
import java.util.Set;

public class UniqueElementsInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 5};
        
        // Create a HashSet to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();
        
        // Iterate through the array and add each element to the HashSet
        for (int element : array) {
            uniqueElements.add(element);
        }
        
        // Print the unique elements
        System.out.println("Unique elements in the array:");
        for (int uniqueElement : uniqueElements) {
            System.out.println(uniqueElement);
        }
    }
}
// output:
// Unique elements in the array:
// 1
// 2
// 3
// 4
// 5

// 13.Write a Java program to count total number of duplicate elements in an array.

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 5};
        
        // Create a HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the array and populate the frequency map
        for (int element : array) {
            // If the element is already in the map, increment its count
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                frequencyMap.put(element, 1);
            }
        }
        
        // Count the total number of duplicate elements
        int totalDuplicates = 0;
        for (int count : frequencyMap.values()) {
            if (count > 1) {
                totalDuplicates += count - 1; // Subtract 1 to account for the first occurrence
            }
        }
        
        System.out.println("Total number of duplicate elements in the array: " + totalDuplicates);
    }
}
// output:
// Total number of duplicate elements in the array: 6

// 14.Write a Java program to delete all duplicate elements from an array.

import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 5};
        
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        // Create a new array to store the unique elements
        int[] uniqueArray;
        
        // Iterate through the original array
        for (int element : array) {
            uniqueElements.add(element);
        }
        
        // Convert the HashSet to an array
        uniqueArray = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            uniqueArray[index++] = element;
        }
        
        // Print the unique elements
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
// output:
// Original array: [1, 2, 3, 4, 1, 2, 2, 3, 4, 4, 5]
// Array with duplicates removed: [1, 2, 3, 4, 5]

// 15. Write a Java program to merge two array to third array.

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        // Calculate the length of the merged array
        int mergedLength = array1.length + array2.length;
        
        // Create a new array to store the merged elements
        int[] mergedArray = new int[mergedLength];
        
        // Copy elements from the first array to the merged array
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        // Copy elements from the second array to the merged array
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        // Print the merged array
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
// output:
// Merged array: [1, 2, 3, 4, 5, 6, 7, 8]

