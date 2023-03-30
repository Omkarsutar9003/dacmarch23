/*
28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).

 */

 class Ass_Q28
 {
   public static void main(String[] args)
    { 
        double d=1569.58;
        System.out.println("double value into String = "+Double.toString(d));
        Double d_instance=new Double(d);
        System.out.println("double value into Double instance = "+d_instance);
        String str="12345.89";
        System.out.println("String instance into Double instance = "+Double.valueOf(str));
        System.out.println("double value into hexadecimal  = "+Double.toHexString(d));
        //System.out.println("double value into Binary  = "+Double.toBinaryString(d));
        //System.out.println("double value into Octal  = "+Double.toOctalString(d));


   }

 }