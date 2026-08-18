//Write a program to find all the factors or divisor for the given number.
class Program2
{
    public static void main(String [] args)
{
    int num = 24;
    int count = 0;
    for( int i = 1 ; i <= num ; i++)
    {
        if(num % i == 0)
        {
            System.out.println(i);
        }
    }
   }
}
