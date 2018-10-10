// Leetcode problem, "To Lower Case" : https://leetcode.com/problems/to-lower-case/description/
// Two solutions.


	// Using java's built in toLowerCase()
	public static String toLowerCase(String str) {
		return str.toLowerCase();
	}
	
	
	// The ASCII values of A-Z are 65-90 inclusive, so if the value
	// of c falls within this range the letter is capital. By adding 32
	// to that value we obtain the lower case version of that letter.
	public static String toLowerCaseTwo(String str) {
		String toLower = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				toLower += (char) (c + 32);
			} else {
				toLower += c;
			}
		}
		return toLower;
	}
