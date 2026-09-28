class FequencyOfChar
{
    public static void main(String[] args) 
	{
		String s = "yf12o34 offf";
		s = s.toLowerCase();
		char ch[] =s.toCharArray();
		boolean b[] = new boolean[ch.length];
		
		for(int i = 0 ; i<= ch.length-1;i++) 
		{
			int count =0 ;
			if(b[i]!=true && Character.isAlphabetic(ch[i])) 
			{
				for(int j = 0 ;j<=ch.length-1;j++) 
				{
					if(ch[i]==ch[j]) 
					{
						count++;
						b[j]=true;
					}
				}
				if(count>1)
				System.out.println(ch[i] + " => " + count);
			}
		}
		
	}

}