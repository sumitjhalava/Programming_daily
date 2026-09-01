class Program16
{
    static boolean isStrong(int n)
    {
        int num = n;
        int sum = 0;
        while(n>0)
        {
            int fact = 1;
            int digit = n % 10;
            for(int i = 1; i <=digit; i++)
            {
                fact = fact * i;
            }
            sum = sum + fact;
            n=n/10;

        }
        return sum == num;

    }
    public static void main(String [] args)
    {
         int sum = 0;
    for(int i = 1 ; i<=1000; i++)
    {
        if(isStrong(i))
        {
            sum = sum + i;
        }
    }
    System.out.println(sum);

    }
   
}