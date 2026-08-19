//Write a metohd to find factorial of a program.
class Program5
{
    static void fact(int num)
    {
        int result =1;
        for(int i = 1; i<=num;i++)
        {
            result =result*i;
        }
        System.out.println(result);
        
        
    }

    public static void main (String [] args)
    {
        fact(5);
    }

}