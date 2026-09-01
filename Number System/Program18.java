//? print nth prime number.
class Program18
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
           
            count++;
            a++;
            
        }
         System.out.println(a - 1);
    }


    public static void main(String [] args)
    {
        int n = 4 ;
        printPrime(n);
    }
}