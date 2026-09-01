//design a method to reverse the given number.
class Program13
{
    static int reverse(int n)
    {
        int digit = n%10;
        n= n/10;
    
        while(n>0)
        {
        int temp= n % 10;
        digit = digit * 10 + temp;
            n=n/10;
        }

    return digit;
}
    public static void main(String [] args)
    {
        int n = 865;
       System.out.println( reverse(n));
    }
}