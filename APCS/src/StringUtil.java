/**
 * Sawyer McBride
 * 
 *
 */

public class StringUtil {
	// This constant contains all of the characters that should be removed
	// from a string before it is checked to see if it is a palindrome
	private static final String CHARS_TO_REMOVE = " \'\".,!?;:-";
	// This constant contains the vowels that should be used when converting
	// a phrase to Pig Latin and when converting a phrase into shorthand
	private static final String VOWELS_TO_USE = "aAeEiIoOuU";

	// This public method reverses all of the characters in a phrase
	public static String Reverse(String phrase)
	{
		String s = "";
		for(int i = phrase.length()-1; i >= 0;i--)
			s+=phrase.charAt(i);
		return s;
	}

	// This public method determines whether or not a phrase is a palindrome
	public static boolean Palindrome(String phrase)
	{
		phrase = CleanUp(phrase);
		String reversedPhrase = Reverse(phrase);
		return reversedPhrase.equals(phrase);
	}

	// This public method converts a phrase into Pig Latin
	public static String PigLatin(String phrase)
	{
		return Separate(phrase);
	}
	private static boolean contains(String s, String[] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < s.length(); j++ ) {
				if (Character.toString(s.charAt(j)) == a[i])
					return true;
			}
		}
		return false;
	}
	// This public method converts a phrase into shorthand
	public static String Shorthand(String phrase)
	{
		String vowelsArr[] = new String("aAeEiIoOuU").split("");
		for(int i = 0; i < vowelsArr.length; i++) {
			for(int j = 0; j < phrase.length(); j++) {
				if(Character.toString(phrase.charAt(j)).equals(vowelsArr[i]))  {
					phrase = Replace(Character.toString(phrase.charAt(j)), "",phrase );
				}
			}
		}
		return phrase;
	}

	// This method converts a single word into Pig Latin; the word MUST NOT contain any spaces
	private static String Latinate(String word)
	{
		word = word.toLowerCase();
		String vowelsArr[] = new String("aAeEiIoOuU").split(""); 
		// First Pig Latin rule: If the word does not contain any vowels
		if(!contains(word, vowelsArr ))
			// (a-A-e-E-i-I-o-O-u-U), just add "ay" to the end of the word
			return word+"ay";
		else {
			// Second Pig Latin rule (to be followed only if the first rule does not apply): If
			// the first letter in the word is a vowel, just add "yay" to the end of the word
			if(contains(Character.toString(word.charAt(0)), vowelsArr))
				return word+"yay";
		}
		// Third Pig Latin rule (to be followed only if the above two rules do not apply): Move all
		// leading consonants to the back of the word, and then add "ay" to the end of the new word
		String consonants = "";
		for(int i = 0; i < word.length(); i++) {
			if(contains(Character.toString(word.charAt(i)), vowelsArr)) {
				consonants = word.substring(0, i-1);
				word = word.substring(i-1);
			}
		}
		word = Character.toString(word.charAt(0)).toUpperCase() + word.substring(1);
		
		return word+consonants+"ay";
		
		// Final Pig Latin rule (to be followed after the above third rule): If the original word started
		// with a capital letter, make it lowercase and instead capitalize the first letter of the new word
		
	}

	// This recursive method breaks a phrase into its individual words/parts, has each word
	// converted to Pig Latin, and then rebuilds the string as the recursion is finished
	private static String Separate(String phrase)
	{
		if(phrase.indexOf(" ") == -1 ) 
			return Latinate(phrase);
		else 
			return Latinate(phrase.substring(0, phrase.indexOf(" "))) + Separate(phrase.substring(phrase.indexOf(" ")+1)); 
	}

	// This method removes all punctuation (and other unwanted characters)
	// from a phrase and converts the phrase to all lowercase characters
	private static String CleanUp(String phrase) {
		String rmArr[] = new String(CHARS_TO_REMOVE).split("");
		for(int i = 0; i < rmArr.length; i++) {
			for(int j = 0; j < phrase.length(); j++) {
				if(Character.toString(phrase.charAt(j)).equals(rmArr[i]))  {
					StringBuilder s = new StringBuilder(phrase).deleteCharAt(j);
					phrase = s.toString();
				}
			}
		}
		return phrase;
	}

	// This method replaces every occurrence of one string with another string within
	// a specific phrase WITHOUT using the 'replace()' method of the 'String' class
	private static String Replace(String x, String y, String phrase)
	{
		return phrase.substring(0, phrase.indexOf(x)) + y + phrase.substring(phrase.indexOf(x)+x.length());
	}
}

