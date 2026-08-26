class nFibonacciNo
{
    static void printFib(int n)
    {
        int count = 0;
        int pre = 0;
        int curr = 1;
        while (n != count )
        {
            int sum = pre + curr ;
            System.out.println(sum);
            pre = curr;
            curr = sum;
            count++;
        }
    }
    public static void main(String [] args)
    {
        int n = 5; 
        printFib(n);
    }
}
        