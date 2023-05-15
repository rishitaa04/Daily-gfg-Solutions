
// package dailygfgsolutions.java;
// Given an array Arr of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
import java.util.*;

public class searchinganumber {
    public static void main(String args[]) {
        int arr[] = { 9, 7, 2, 16, 4 };
        int ans = -1;
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                // break;
                ans = i + 1;
                break;
            }
        }
        System.out.println(ans);
        
    }
}
