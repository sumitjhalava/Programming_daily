//Write a Program to design a method to find the sum of even digits present in a number .
class Program8
{
    static void sum(int n)
    {
       int sum =0;
        while(n>0)
        {
             int digit = n % 10;
             if(digit % 2 == 0)
             {
                sum = sum + digit;
                n=n/10;
             }
             else
             {
                n=n/10;
             }
        }
        System.out.println(sum); 
    }
    public static void main(String [] args)
    {
        int num = 120202;
        sum(num);
    }
}