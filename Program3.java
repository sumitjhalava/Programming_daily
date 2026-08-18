//Write a program to find  the count of all the factors or divisor for the given number.
class Program3
{
    public static void main(String [] args)
{
    int num = 10;
    int count = 0;
    for( int i = 1 ; i <= num ; i++)
    {
        if(num % i == 0)
        {
           count =count + 1;
        }
    }
    System.out.println(count);
   }
}
