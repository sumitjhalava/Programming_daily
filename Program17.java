//? print n prime number.
class Program17
{
    static void printPrime(int n)
    {
        int count = 0;
        int a = 2 ;
        while (count != n)
        {
            for(int i = 2; i<=a/2 ; i++)
            {
                if(a % i == 0)
                {
                    a++;
                }
                
            }
            System.out.println(a);
            count++;
            a++;
            
        }
    }


    public static void main(String [] args)
    {
        int n = 5 ;
        printPrime(n);
    }
}