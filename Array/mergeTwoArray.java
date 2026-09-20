import java.util.Arrays;
class mergeTwoArray
{
    public static void main(String [] args)
    {
        int a []={11,1,2,3,90,43};
        int b []={10,20,30,40,50};
        int c[] =new int[a.length+b.length];
        int x =0;
        int y =0;
        for(int i =0;i<=c.length-1;i++)
        {
            if(i%2==0)
            {
                c[i]=a[y];
                y++;
            }
           
            else
            {
            c[i]=b[x];
            x++;
            }
        } 
        System.out.println(Arrays.toString(c));
    }
}