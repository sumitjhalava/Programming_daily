//Write a Program to design a method to check weather a number is spy no. or not .

class Program11

    
{
    static boolean countPrimeDigit(int n)
    {
        int sum =0;
        int product=1;

        while(n>0)
        {
            int digit = n%10;
            sum = sum + digit;
            product = product * digit;
            n=n/10;

        }
        if(sum == product)
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
        int num = 32412;
        boolean result = countPrimeDigit(num);
        System.out.println(result);
    }
}
