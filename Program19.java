//print nearest prime number to a given number.
class Program19
{
    public static void main(String [] args)
    {
        int n = 19;
        int a = n - 1;
        int b = n + 1;
        while(true)
        {
            boolean isPrimeA = true;
            boolean isPrimeB = true;

            for(int i = 2; i <= Math.sqrt(a); i++)
            {
                if(a % i == 0)
                {
                    isPrimeA = false;
                    break;
                }
            }

            for(int i = 2; i <= Math.sqrt(b); i++)
            {
                if(b % i == 0)
                {
                    isPrimeB = false;
                    break;
                }
            }

            if(isPrimeA)
            {
                System.out.println("Nearest prime number less than " + n + " is: " + a);
                break;
            }
            else if(isPrimeB)
            {
                System.out.println("Nearest prime number greater than " + n + " is: " + b);
                break;
            }

            a--;
            b++;
        }
    }
}