// Leetcode problem, "Jewels and Stones" : https://leetcode.com/problems/jewels-and-stones/description/
// Three Solutions

// Inefficient way, requires us to compare each character against ne another in both strings.
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        
        for(int i = 0; i < J.length(); i++){
            for(int k = 0; k < S.length(); k++){
                if(J.charAt(i) == S.charAt(k)){
                    count++;
                }
            }
        }
        return count;
    }
    
// More efficient way of putting J(defined as all unique characters) in a string, then checking
// if the characters in S are contained in the set.
class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<Character> jLet = new HashSet<>();
        for(char c : J.toCharArray()){
            jLet.add(c);
        }
        int count = 0;
        for(char d : S.toCharArray()){
            if(jLet.contains(d)){
                count++;
            }
        }
        return count;
    }
}
    
// Replaces every character in S that is not in J ith "" , then returns the length of the string S
// after every character not in J is removed.
class Solution {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
