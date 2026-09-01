//convert binary to decimal 
class biToDec
{
    static int toDec(int n)
    {
        int sum = 0;
        int m = 0;
        while(n>0)
        {
            int digit = n % 10;
            int power = digit * (int)Math.pow(2,m);
            sum = sum + power;
            n = n/10;
            m++;
        }
        return sum ;
    }
    public static void main(String [] args)
    {
        int n = 1000111;
       System.out.println( toDec(n));
    }
}