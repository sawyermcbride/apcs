//	Sample Calling Class for
//
//	StringUtil() Class
	public class A10_StringUtil
	{
	public static void main(String[] args)
	{
	// Test the phrase reverser
	System.out.println(StringUtil.Reverse("I like computers!"));
	// Test the palindrome checker
	System.out.println(StringUtil.Palindrome("radar"));
	System.out.println(StringUtil.Palindrome("J"));
	System.out.println(StringUtil.Palindrome("Lewd did I live, & evil I did dwel."));
	System.out.println(StringUtil.Palindrome("I like Java"));
	System.out.println(StringUtil.Palindrome("Straw? No, too stupid a fad, I put soot on warts."));
	// Test the Pig Latin converter
	System.out.println(StringUtil.PigLatin("Why do they think you and Sheena should return immediately?"));
	// Test the shorthand converter
	System.out.println(StringUtil.Shorthand("You and she should not go to the party, for you will be bored!"));
	}
}