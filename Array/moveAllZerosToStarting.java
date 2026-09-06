import java.util.Arrays;
class moveAllZerosToStarting
{
    public static void main(String [] args)
    {
        int arr[]={23,987,0,0,2,0,5,3,0,5};
        int a = arr.length-1;
        for(int i = arr.length-1 ; i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[a]=arr[i];
                
                a--;
               
            }
        }
        System.out.println("a value : " + a);
        for(int i = 0 ;i<=a;i++)
        {
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}