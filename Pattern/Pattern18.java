class Pattern18
{
    public static void main(String [] args)
    {
        int n =4;
        int st = 1;
        int sp = 2*n-3;
        for(int i =1 ; i<=n; i++)
        {
            for(int j = 1 ; j<=st;j++)
            {
                System.out.print("* ");
                 
            }
            for(int j=1 ;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(int j =1;j<=i;j++)
            {
                 if(j==n)
                break;
               System.out.print("* ");
              
            }
            System.out.println();
            st++;
            sp-=2;
        }
    } 
}