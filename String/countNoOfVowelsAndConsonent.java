class countNoOfVowelsAndConsonent
{
    public static void main(String[] args)
    {
        String s = "Hellafhnoqaoirnhoiafnovn osbnwogfjbnawoifosdn vjoswwngoiwiangfoinslkcvnsjobguosbuovdbjos vjksjo vduiws";
        int countV =0;
        int countC =0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1)
            countV++;
            else
            countC++;
        }
        System.out.println("Vowels = " + countV  );
        System.out.println("Consonent = " + ( countC)  );
    }
}
    

