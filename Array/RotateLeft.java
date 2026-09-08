import java.util.Arrays; 
class RotateLeft
{
    public static void main(String[]args)
    {
        int a[] = {1,2,3,4,5};
        int k = 2;
        for(int i = 0 ;i<k;i++)
        {
            int first = a[0];
            for(int j=1;j<=a.length-1;j++)
            {
                a[j-1]=a[j];
            }
            a[a.length-1]=first;
        }
        System.out.println(Arrays.toString(a));
    }
}