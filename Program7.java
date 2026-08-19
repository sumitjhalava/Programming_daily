//Write a Program to design a method to find the sum of digits present in a number & count of digt and product of the digts.
class Program7
{
    static void sum(int n)
    {
        int count = 0;
        int res =0;
        int product =1;
        while(n>0)
        {
            res = res + n % 10;
            product = product * n%10;
            count++; 
            n = n/10;   
        }
        System.out.println("sum " + res);
        System.out.println("count : " + count);
        System.out.println("Product :" + product);
    }
    public static void main(String [] args)
    {
        int num = 10;
        sum(num);
    }
}