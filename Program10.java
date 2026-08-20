//Write a Program to design a method to find the count of prime digits present in a number .

class Program10

    
{
    static int countPrimeDigit(int n)
    {
       int count = 0;
        while(n-1 > 1)
        {
             int digit = n % 10;
             if(digit % 2 == 0)
             {
                n=n/2;
             }
             else
             {
                count++;
                n=n/10;
             }
        }
        return count; 
    }
    public static void main(String [] args)
    {
        int num = 528;
        int result = countPrimeDigit(num);
        System.out.println(result);
    }
}
