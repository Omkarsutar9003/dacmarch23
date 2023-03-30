/*Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

class Ass_Q8
{
    public static void main(String[] args) 
    {
        
        byte b1=120;
        System.out.println("byte value into String = "+Byte.toString(b1));

        Byte B=Byte.valueOf(b1);
        System.out.println("byte value into Byte instance = "+B);

        String str="122";
        Byte b2=Byte.valueOf(str);
        System.out.println("String instance into Byte instance = "+b2);



        

    }


}

