class mostRepeated
{
    public static void main(String args[])
    {
        
        int a[]={191,1,1,1,47,47,47,47,47,1,16};
        int mostRepeated =0;
        int re =a[0];
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
                  if(count > mostRepeated)
                 {
                    mostRepeated = count;
                    re=a[i];
                 }
            }
           
        }
       
                   System.out.println(re + "--> " + mostRepeated);
    }
}
