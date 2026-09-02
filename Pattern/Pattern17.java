class Pattern17 
{
     public static void main(String [] args)
      {
int a = 2;
int n = 4;
int p = n;

while(p > 0)
{
    boolean prime = true;

    for(int i = 2; i <= a / 2; i++)
    {
        if(a % i == 0)
        {
            prime = false;
            break;
        }
    }

    if(prime)
    {
        for(int m = 1; m <= n; m++)
        {
            for(int j = 1; j <= m; j++)
            {
                System.out.print(a + " ");
                a++;
            }

            System.out.println();
        }

        p--;
    }

    a++;
}
      }
}