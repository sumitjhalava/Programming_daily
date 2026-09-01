class Program15
{
    static boolean isArmstrong(int n)
    {
        int num = n;
        int count = 0;
        while(n>0)
        {
            count++;
            n=n/10;
        }  
        return mal(count,num);
        
    }

    static boolean mal(int c, int n)
    {
        int sum = 0;
        int num = n;
        while(n>0)
        {
            int digit = n % 10;
            int product =1;

            for(int i = 1 ; i <= c; i++)
            {
                product = digit * product;
            }
            sum = sum + product;
            n = n/10;
        }
        return sum == num ;
    }
    public static void main(String [] args)
    {
        int n = 15;
       System.out.println( isArmstrong(n));
    }
}