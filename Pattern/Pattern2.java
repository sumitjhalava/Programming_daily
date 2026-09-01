class Pattern2
{
    public static void main(String [] args)
    {
        int a = 1 ;
        for(int i = 1 ; i <= 5; i++)
        {
            for(int j = a ;j <= a+4; j++)
            {
                System.out.print(j+ " ");
            }
            a = a + 5 ;
            System.out.println();

        }
    }
}