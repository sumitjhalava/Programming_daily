import java.util.*;
class sortArray
{
    public static void main(String[] args)
    {
        int arr[] = {17,3,2,5,8,9};
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        
        while(i < j)
        {
            // Bubble sort from left
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            i++;
            
            // Bubble sort from right
            if(arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            j--;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}