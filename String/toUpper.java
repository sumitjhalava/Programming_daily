class toUpper
{
    public static void main(String[] args)
    {
        String s = "java FuLL Stack";
        s = s.toLowerCase();
        char [] ch = s.toCharArray();
        for(int i = 0 ; i<=ch.length-1;i++ )
        {
            if(i==0 || i==ch.length-1 || ch[i+1] == ' ' || ch[i-1] == ' ')
            {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(new String(ch));
    }

}