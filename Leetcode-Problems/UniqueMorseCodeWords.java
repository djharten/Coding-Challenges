// Leetcode Problem, "Unique Morse Code Words": https://leetcode.com/problems/unique-morse-code-words/description/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..", "--",
		                      "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> unique = new HashSet<>();
		for(int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < words[i].length(); j++) {
				sb.append(morseCode[ (char) (words[i].charAt(j) - 'a') ] );
			}
			unique.add(sb.toString());
		}
		return unique.size();
    }
}
