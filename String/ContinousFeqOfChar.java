class ContinousFeqOfChar
{
    public static void main(String [] args)
    {
        String s = "aaabbaackccc";
        int count = 1;
        char c = s.charAt(0);
        for(int i = 0 ; i<=s.length()-2;i++)
        {
            char ch = s.charAt(i);
            if(ch == s.charAt(i+1))
            {
                count++;
                c = ch ;
            }
            else
            {
            System.out.print(ch +"" + count);
            count = 1 ;
            }
             
        }
       
         System.out.print(c +"" + count);

    }
}