class Ass_Q11
{
  public static void main(String args[])
  {
            String char_in=args[0];
            char ch=char_in.charAt(0);
    //System.out.println(ch);
            boolean check=Character.isDigit(ch);
    if(check==true)
            
             System.out.println("enterd digit = "+ch);

            boolean check1=Character.isLetter(ch);
            System.out.println("CodePoint = "+(int)ch);

            

       if(check1==true)
       {

            boolean check2=Character.isLowerCase(ch);

       if(check2==true)
       {
            char ch1=Character.toUpperCase(ch);

            System.out.println("Converted into upercase -> "+ch1);
            System.out.println("CodePoint = "+(int)ch1);
       }
       else
       {
            char ch2=Character.toLowerCase(ch);

             System.out.println("Converted into lowercase -> "+ch2);
             System.out.println("CodePoint = "+(int)ch2);
       }
       }



    


  }
}
//boolean check2=Character.isUpperCase(ch);