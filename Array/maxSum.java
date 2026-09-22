import java.util.* ;
class maxSum
{
    public static void main(String [] args)
    {
        int [] a ={2,0,4,-6,-5,-9};
       int  cs = 0;
       int  ms = a[0];
        for(int i = 0;i<=a.length-1;i++)
        {
            cs = cs + a[i];
            ms = Math.max(ms,cs);
            if(cs<0)
            {
                cs = 0;
            }
        } 
        System.out.println(ms);

    }
}