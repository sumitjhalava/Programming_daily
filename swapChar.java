class swapChar
{
    public static void main(String [] args)
    {
        String s = "JavA FulL hey there @ StacK";
        int i = 0 , j = 0;
        char [] ch = s.toCharArray();
        while (i<ch.length && j<ch.length)
        {
            if(ch[j]==' ' )
            {
                char temp = ch[i];
                ch[i]=ch[j-1];
                ch[j-1]=temp;
                i=j+1; j++;
            }
            else if(j==ch.length-1)
            {
                char temp = ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                j++;
            }
            else
            j++;
            
        }
        System.out.println( new String(ch));
    }
}