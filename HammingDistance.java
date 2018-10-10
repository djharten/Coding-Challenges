// Leetcode Problem, "Hamming Distance" : https://leetcode.com/problems/hamming-distance/description/
// Two solutions

// Converts the integers to their binary values, adds leading zeros to the shorter number(if applicable)
// to make the lengths the same, then compares the characters and returns the number of differences.
class Solution {
    public int hammingDistance(int x, int y) {
		
      String xStr = Integer.toBinaryString(x);
      String yStr = Integer.toBinaryString(y);

      int difLength = Math.abs(xStr.length() - yStr.length());

      if(xStr.length() > yStr.length()){
        for(int i = 0; i < difLength; i++) {
          yStr = '0' + yStr;
        }
      } else if(yStr.length() > xStr.length()) {
        for(int j = 0; j < difLength; j++) {
          xStr = '0' + xStr;
        }
      }

      int count = 0;

      for(int k = 0; k < xStr.length(); k++) {
        if(xStr.charAt(k) != yStr.charAt(k)) {
          count++;
        }
      }
          return count;
    }
}

// XORs the two values, then takes result of that and returns the number of 1's.
// Ex: x = 1, y = 4
//     ------------
//     x = 0 0 1
//     y = 1 0 0
//     ^ = 1 0 1 - Then count the number of 1's(values where the bits are different) 
class Solution {
    public int hammingDistance(int x, int y) {
        int sameVal = x ^ y;
        return Integer.bitCount(sameVal);
    }
}
