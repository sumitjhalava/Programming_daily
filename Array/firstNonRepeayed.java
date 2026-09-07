class firstNonRepeayed
{
    public static void main(String args[])
    {
        
        int a[]={1,47,1,1,3,2,4,2,3,4,2,32,3};
        
        boolean b[] = new boolean[a.length];
        for(int i = 0;i<=a.length-1;i++)
        {
            int count =1;
            if(b[i]==false)
            {
                for(int j=i+1;j<=a.length-1;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                        b[j] = true;
                    }
                }
                 if(count==1)
                {
                    System.out.println(a[i]+" --> " + count);
                    break;
                 }
            }
        }
    }
}
