// Leetcode Problem, "Sort Array By Parity" : https://leetcode.com/problems/sort-array-by-parity/description/

// Creates the array, then takes 2 counters that hold the indexes of the beginning and end of the array.
// Store the even numbers in the front of the array and increment the counter, and store the even numbers
// in the back of the array and decrement the counter.
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] sortArr = new int[A.length];
        int oddLoc = A.length-1;
        int evenLoc = 0;
        for(int i = 0; i < sortArr.length; i++){
            if(A[i] % 2 == 0){
                sortArr[evenLoc] = A[i];
                evenLoc++;
            } else {
                sortArr[oddLoc] = A[i];
                oddLoc--;
            }
        }
        return sortArr;
    }
}
