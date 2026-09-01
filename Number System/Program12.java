//Write a Program to design a method to find the weather a number is neon or not.

class Program12   
{
    static boolean isNeon(int n)
    {
        int square = 1;
        int sum = 0;
       
        square = n * n;
             

        System.out.println("Square : "  + square);
        while(square>0)
        {
            int digit = square % 10;
            sum = sum + digit;
            square = square/10;

        }
        
        if(n == sum)
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
        int n = 9;
        boolean result = isNeon(n);
        System.out.println(result);
    }
}
