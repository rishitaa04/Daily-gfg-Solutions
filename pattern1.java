Input: 5

Output:
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *


class Solution {

    void printSquare(int n) {
        // code here
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
