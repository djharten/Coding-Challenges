// Leetcode Problem, "Reverse Only Letters" : https://leetcode.com/problems/reverse-only-letters/

// Places all non-letters into a char array at their same location, then takes a counter from the end of the
// array, decrementing whenever a non character is found or a character from the beginning of the array is placed.
// Very efficient(beats 99.89% of submissions).
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] vals = S.toCharArray();
        char[] newVals = new char[vals.length];
        for(int i = 0; i < vals.length; i++) {
        	if(!Character.isLetter(vals[i])) {
        		newVals[i] = vals[i];
        	}
        }
        
        int revIndex = vals.length-1;
        
        for(int j = 0; j < vals.length; j++) {
        	while(revIndex >= 0 && !Character.isLetter(vals[revIndex])) {
        		revIndex--;
        	}
        	while(j < vals.length && !Character.isLetter(vals[j])) {
        		j++;
        	}
        	if(revIndex >= 0 && j < vals.length) {
	        	newVals[revIndex] = vals[j];
	        	revIndex--;
        	}
        }
        return new String(newVals);
    }
}
