// package dailygfgsolutions.java;
// Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
// Input:
// str = 101
// Output:
// 1
// Explanation:
// Since string contains only 0 and 1, output is 1.

// Input:
// str = 75
// Output:
// 0
// Explanation:
// Since string contains digits other than 0 and 1, output is 0.

import java.util.Scanner;

public class checkforbinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String str;
        boolean flag = false;
        str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1' || str.charAt(i) == '0') {
                flag = true;
            }
            // else{
            // System.out.println(0);
            // }
            sc.close();
        }
        if(flag==false){
        System.out.print(0);
        }
        else{
        System.out.println(1);
        }
    }
}
