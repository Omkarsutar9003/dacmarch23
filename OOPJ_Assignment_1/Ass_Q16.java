
/*Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
 */

 class Ass_Q16
{
  public static void main(String args[])
  {
   
     int num=90035;
     String str=Integer.toString(num);
     System.out.println("int value into String = "+str);
     
     Integer NUM=Integer.valueOf(num);
     System.out.println("int value into Integer instance = "+NUM);

     String Str1="7620539";
     Integer mno=Integer.valueOf(Str1);

     System.out.println("String instance into Integer instance = "+mno);

      String oct_No =Integer.toOctalString(mno);
     System.out.println("int value into octal = "+oct_No);

     String Bina_No =Integer.toBinaryString(mno);
     System.out.println("int value into binary = "+Bina_No);

     String Hex_No =Integer.toHexString(mno);
     System.out.println("int value into Hexa = "+Hex_No);
     





   
  }




}