import java.io.*;
import java.util.*;
public class ans1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter string:  ");
		String str=scan.nextLine();
		System.out.print("Enter substring:  ");
		String substring=scan.nextLine();
		HashMap<Character,Integer>mapsubstring=new HashMap<>();
		for(int i=0;i<substring.length();i++)
		{
			if(mapsubstring.containsKey(substring.charAt(i)))
			{
				Integer a=mapsubstring.get(substring.charAt(i));
				a+=1;
				mapsubstring.put(substring.charAt(i),a);
			}
			else
			{
				mapsubstring.put(substring.charAt(i),1);
			}
		}
		HashMap<Character,Integer>mapstring=new HashMap<>();
		int ans=0;
		for(int i=0;i<substring.length();i++)
		{
			if(mapstring.containsKey(str.charAt(i)))
			{
				Integer a=mapstring.get(str.charAt(i));
				a+=1;
				mapstring.put(str.charAt(i),a);
			}
			else
			{
				mapstring.put(str.charAt(i),1);
			}
		}
		if(mapsubstring.equals(mapstring))
			ans+=1;
		for(int i=substring.length();i<str.length();i++)
		{
			if(mapstring.containsKey(str.charAt(i-substring.length())))
			{
				if(mapstring.get(str.charAt(i-substring.length()))==1)
				{
					mapstring.remove(str.charAt(i-substring.length()));
				}
				else
				{
					Integer a=mapstring.get(str.charAt(i-substring.length()));
					a-=1;
					mapstring.put(str.charAt(i-substring.length()),a);
				}
			}
			if(mapstring.containsKey(str.charAt(i)))
			{
				Integer a=mapstring.get(str.charAt(i));
				a+=1;
				mapstring.put(str.charAt(i),a);
			}
			else
			{
				mapstring.put(str.charAt(i),1);
			}
			if(mapsubstring.equals(mapstring))
				ans+=1;
		}
		System.out.print("No. of substrings in string = ");
		System.out.print(ans);
	}
}