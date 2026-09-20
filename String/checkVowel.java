class checkVowel
{
    public static void main(String[] args)
    {
        String s = "HelloAEIOU";
        for(int i=0;i<=s.length()-1;i++)
        {
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
                System.out.println(s.charAt(i));
            // else
            // System.out.println("no Vowel found");
            
        }
    }
}
