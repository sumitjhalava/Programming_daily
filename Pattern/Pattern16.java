class Pattern16
{
    public static void main(String [] args)
    {
        int n = 4;
        int sp = 3;
        int st = 1;
        for(int i = 1; i<=n; i++)
        {
            for(int j =1 ; j<=i;j++ )
            {
                System.out.print("*");
            }
                 System.out.println();
        
        }
        
        for(int i = 1 ; i<=n;i++)
        {
            for(int j =1 ; j<=sp;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1;k<=st;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp--; st++;
        }
       
        
       
    }
}