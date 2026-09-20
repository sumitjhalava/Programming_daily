class reverseString 
{
    public static void main(String[]args)
    {
        String s ="Hello";
        char [] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i<j)
        {
            char temp = c[i];
            c[i]=c[j];
            c[j] = temp;
            i++;
            j--;
        }
        String reverse = new String(c);
        System.out.println(reverse);
    }
}