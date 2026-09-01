class removeDigit
{
    static String removeDigit(int n, int m )
    {
        String str = "";
        while(n>0)
        {
            int digit = n%10;
            if(digit != m)
            {
                str = digit + str;
                n=n/10;
            }
            else
            n=n/10;
        }
        return str;
    }
    public static void main (String [] args)
    {
        int n = 346212;
        int m = 2;
       System.out.println (removeDigit(n,m));
    }
}