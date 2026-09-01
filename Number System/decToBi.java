// convert decimal to binary.
class decToBi
{
    static void convertToBinary(int n )
    {
        int dec = 0;
        while(n>0)
        {
            int rem = n % 2;
            System.out.print(rem);
        
           
            n=n/2;
        }
         
        
    }

    public static void main(String [] args)
    {
        int n = 50 ;
        convertToBinary(n);
    }
}