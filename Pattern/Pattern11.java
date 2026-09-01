class Pattern11
{
    public static void main(String[] args)
    {
        int a = 0;
        int n = 5 ;
        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = 1 ; j<= n-i;j++)
            {
            System.out.print("   ");
            }
            for(int k = 1 ; k<=i+a;k++)
            {
                System.out.print(" * ");
            }
            a++;
           System.out.println();

        }
       
    }
}