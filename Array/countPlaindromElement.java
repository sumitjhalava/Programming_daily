class countPlaindromElement
{
    static boolean count(int n )
    {
        int num = n ;
        int palan = 0 ;
        while(n>0)
        {
            int digit = n%10;
             palan = palan*10 + digit;
            n=n/10;
        }
        return num==palan;
    }
    public static void main(String [] args)
    {
        int arr[] ={3,1,2322,3332333};
        int Count =0;
        for(int ele : arr)
        {
            if(count(ele)==true)
            {
                Count++;
            }
        }
        System.out.println(Count);
    }
}