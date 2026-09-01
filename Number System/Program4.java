//Write a program to define a method to check the given number is prime or not.
class Program4
{
    static boolean isPrime(int num)
    {
        int count=0;
        for(int i = 2; i<=num; i++)
        {
            if(num % i == 0)
            {
                count++ ;
            }
        }
        if(count==1)
        {
            return true;
        }
        else
        {
            return false; 
        }
    }
    public static void main(String [] args)
    {
        System.out.println(isPrime(109));
    }
}