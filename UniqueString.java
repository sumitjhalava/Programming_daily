import java.util.*;
class UniqueString
{
    public static boolean isUnique(String s) 
	{
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0 ; i<=s.length()-1 ;i++) 
		{
			char ch = s.charAt(i);
			if(hs.contains(ch))
				return false;
			else
				hs.add(ch);
		}
		return true;
	}
	

	public static void main(String[] args)
	{
		String s = "abcta";
		if(isUnique(s))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}