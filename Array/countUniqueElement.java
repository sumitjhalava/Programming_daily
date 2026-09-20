import java.util.Arrays;
class countUniqueElement
{
    public static void main(String args[])
    {
        int a [] ={1,1,1,7,2,2,3,4};
        boolean b[]=new boolean[a.length];
        int k [] = new int[a.length];
        int unique=0;
        int x=0;
         
        for(int i =0;i<=a.length-1;i++)
        {
            if(b[i]==false)
            {
                 unique++;
                int count =1;
                if(a[i]!=0)
                 k[i]=a[i];
                for(int j = i+1;j<=a.length-1;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                        b[j]=true;
                       
                        x=a[i];
                        
                    }
                }
                 
                
                
            }
            
        }
        
        int [] c =new int[unique];
        for(int i=0;i<=unique-1;i++)
        {
            if(k[i] !=0 )
            {
                c[x]=k[i];
                x++;
            }
            
        }
          
          System.out.println(Arrays.toString(c));
          System.out.println( Arrays.toString(k));
    }
    
}