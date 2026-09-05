import java.util.*;
class merge2Array
{
    public static void main(String[] args)
    {
        int a [] ={1,2,3};
        int b []={4,5,6};
        int c [] = new int[a.length + b.length];
        
        for(int i = 0 ; i<=c.length-1;i++)
        {
            if(i<a.length)
            {
                for(int j = 0 ;j<=a.length-1;j++)
                {
                    c[i]=a[j];
                    
                }
            }
            else
            {
                for(int j = 0 ;j<=b.length-1;j++)
                {
                    c[i]=b[j];
                    
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
   
}