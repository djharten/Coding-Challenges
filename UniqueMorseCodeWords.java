class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..", "--",
		                      "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> unique = new HashSet<>();
		
		for(int i = 0; i < words.length; i++) {
			String word = "";
			for(int j = 0; j < words[i].length(); j++) {
				word += morseCode[ (char) (words[i].charAt(j) - 97) ];
			}
			unique.add(word);
		}
		return unique.size();
    }
}