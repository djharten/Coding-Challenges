// Leetcode Problem, "Peak Index in a Mountain Array" : 
// Two solutions

// Puts each value in a list, then uses the Collections class to find the index with the max value. Very slow
// solution(beats 1.29% of solutions - ouch!).
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        List<Integer> arrList = new ArrayList<Integer>();
        for (int i : A) {
            arrList.add(i);
        }
        return arrList.indexOf(Collections.max(arrList));
    }
}

// Keeps track of the max value and the max index through the array. Faster solution(beats 45.81% of submissions).
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max){
                max = A[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
