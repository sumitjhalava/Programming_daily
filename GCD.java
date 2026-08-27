//? Greatest common divisor
class GCD
{
    static int gcd(int n, int m)
    {
        int Gcd = 0 ;
        int i = 1;
        int small = 0 ; 
        if(n<m)
        {
            small = n;
            
        }
        else
        {
            small = m;
        }
        while (i<=small)
        {
            if(n % i == 0 && m % i == 0)
            {
                Gcd = i;
            }
            i++;
        }
        return Gcd;
    }
    public static void main(String [] args)
    {
        int n  = 30 , m =  150 ; 
        System.out.println(gcd(n,m));
    }

}