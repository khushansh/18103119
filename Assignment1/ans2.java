import java.io.*;
import java.util.*;
public class ans2{
	public static boolean find(String str,String[] vect)
	{
		for(String st:vect)
		{
			if(st.equals(str))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter paragraph: ");
		String paragraph=sc.nextLine();
		String[] para=new String[1000000];
		int sizeOfPara=0;
		String temp="";
		for(int i=0;i<paragraph.length();i++)
		{
			if(paragraph.charAt(i)==' '||paragraph.charAt(i)=='.'||paragraph.charAt(i)==','||paragraph.charAt(i)=='?'||paragraph.charAt(i)=='!'||paragraph.charAt(i)=='\"')
			{
				para[sizeOfPara]=temp;
				sizeOfPara++;
				para[sizeOfPara]=Character.toString(paragraph.charAt(i));
				sizeOfPara++;
				temp="";
			}
			else
			{
				temp+=Character.toString(paragraph.charAt(i));
			}
		}
		if(temp!="")
		{
			para[sizeOfPara]=temp;
			sizeOfPara++;
		}
		System.out.print("Enter size of vector: ");
		int a=sc.nextInt();
		sc.nextLine();
		String vect[]=new String[a];
		for(int i=0;i<a;i++)
		{
			System.out.printf("Enter %dth string of vector:  ", i+1);
			vect[i]=sc.nextLine();
		}
		for(int i=0;i<para.length;i++)
		{
			if(find(para[i],vect))
			{
				String tmp=Character.toString(para[i].charAt(0));
				for(int j=1;j<para[i].length();j++)
				{
					tmp+="*";
				}
				para[i]=tmp;
			}
		}
		System.out.println("After Modification: " );
		for(int i=0;i<sizeOfPara;i++)
		{
			System.out.print(para[i]);
		}
	}
}