class checkPlaindrom
{
    static boolean checkPlaindrom(String s)
    {
        char [] a = s.toCharArray();
        int i = 0 ; int j = a.length-1;
        while(i<j)
        {
            if(a[i]!=a[j])
            return false;
            i++; j--;
        }
        return true;
    }   
    public static void main(String[] args)
    {
        String s = "1112";
        if(checkPlaindrom(s))
        System.out.println("String is Plandrom");
        else
        System.out.println("String is not plandrom");
    }
}