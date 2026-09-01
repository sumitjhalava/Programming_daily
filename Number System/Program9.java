//Write a Program to design a method to find the count of odd digits present in a number .

class Program9

    
{
    static int sum(int n)
    {
       int count = 0;
        while(n>0)
        {
             int digit = n % 10;
             if(digit % 2 != 0)
             {
                count++;
                n=n/10;
             }
             else
             {
                n=n/10;
             }
        }
        return count; 
    }
    public static void main(String [] args)
    {
        int num = 1578;
        int result = sum(num);
        System.out.println(result);
    }
}
