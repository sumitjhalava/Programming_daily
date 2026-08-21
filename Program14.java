//design a method to check the given number is palandrom or not.
class Program14
{
    static boolean reverse(int n)
    {
        int num = n;
        int digit = n%10;
        n= n/10;
    
        while(n>0)
        {
        int temp= n % 10;
        digit = digit * 10 + temp;
            n=n/10;
        }
        return digit == num;
        

    
}
    public static void main(String [] args)
    {
        int n = 121;
        
       System.out.println( reverse(n));
    }
}