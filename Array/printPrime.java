class printPrime
{
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i =2 ; i<=n/2;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String [] args)
    {
        int arr[] = {17,1,2,3,4,5,6,7,8,9,13};
        
        for(int ele : arr)
        {
            if(isPrime(ele)==true)
            {
                System.out.print(ele + " ");
            }
        }
    }
}