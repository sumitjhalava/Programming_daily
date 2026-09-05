class replaceWithSum
{
    static int sum(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum = sum + digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String []args)
    {
        int arr [] ={12,34,56,76};
        for(int ele : arr)
        {
            int Sum = sum(ele);
            System.out.print(Sum + " ");
        }
    }
}