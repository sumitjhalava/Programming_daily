//write a method to find N to the power of p (n^p)

class Program6
{
    static void power(int n, int p) 
    {
        int result = 1;
        for(int i = 1; i<=p;i++)
        {
             result = result*n;
        }
        System.out.println(result);
    }
    public static void main(String [] args)
    {
        power(2,4);
    }
}