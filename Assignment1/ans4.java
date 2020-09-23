import java.util.*;
public class ans4{
	public static void main(String[] args) {
		System.out.print("Enter First String:   ");
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		System.out.print("Enter Second String:  ");
		String str2=input.nextLine();
		HashMap<Character, Integer> anagram1=new HashMap<>();
		HashMap<Character, Integer> anagram2=new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{
			if(anagram1.containsKey(str1.charAt(i)))
			{
				Integer a=anagram1.get(str1.charAt(i));
				a+=1;
				anagram1.put(str1.charAt(i),a);
			}
			else
			{
				anagram1.put(str1.charAt(i),1);
			}
		}
		for(int i=0;i<str2.length();i++)
		{
			if(anagram2.containsKey(str2.charAt(i)))
			{
				Integer a=anagram2.get(str2.charAt(i));
				a+=1;
				anagram2.put(str2.charAt(i),a);
			}
			else
			{
				anagram2.put(str2.charAt(i),1);
			}
		}
		if(anagram1.equals(anagram2))
		{
			System.out.println("Given two strings are ANAGRAMS.");
		}
		else
		{
			System.out.println("Given two strings are not ANAGRAMS.");
		}
	}
}