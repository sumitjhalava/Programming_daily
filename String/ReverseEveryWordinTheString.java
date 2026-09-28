public class ReverseEveryWordinTheString 
{
	public static void main(String[] args)
	{
		String rev = "";
		String s = "ram is Good";
		String ch[]= s.split(" ");
		for(int i = 0; i<=ch.length-1;i++) 
		{
			rev = rev + reverse(ch[i]) + " ";
			
		}
		System.out.println(rev);
		
	}
	
	public static String reverse(String s) 
	{
		char[]ch =s.toCharArray();
		int i = 0 ; int j = s.length()-1;
		while(i<j) 
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j]=temp;
			i++;j--;
			
		}
		return new String(ch);
	}
}