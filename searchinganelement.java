
// package dailygfgsolutions.java;
// Given an integer array and another integer element. The task is to find if the given element is present in array or not.
// n = 5
// arr[] = {1,2,3,4,5}
// x = 5
// Output: 4
// Explanation: For array elements 
// {1,2,3,4,5} element to be searched 
// is 5 and it is at index 4. So, the 
// output is 4.
import java.util.*;

public class searchinganelement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int n;
        System.out.print("Enter the length of your array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element to be found : ");
        int key = sc.nextInt();
        int index = -1;
        // int n = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        for (int i = 0; arr[i] < n; i++) {
            if (arr[n] == key) {
                break;
                // index = i + 1;
            }
            index = i + 1;
        }
        System.out.print(index);
        sc.close();
    }
}



    
