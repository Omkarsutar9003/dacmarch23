/*.Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.
*/

class Ass_Q9
{

    public static void main(String[] args) 
    {
        Byte B1=new Byte((byte)122);
        System.out.println(B1);
        byte b1=B1.byteValue();
        System.out.println("convert state of Byte instance into byte = "+b1);
        short sh=B1.shortValue();
        System.out.println("convert state of Byte instance into short = "+sh);
        int a=B1.intValue();
        System.out.println("convert state of Byte instance into int = "+a);
        Long l=B1.longValue();
        System.out.println("convert state of Byte instance into long = "+l);
        float f=B1.floatValue();
        System.out.println("convert state of Byte instance into float = "+f);
        double d=B1.doubleValue();
        System.out.println("convert state of Byte instance into double = "+d);






    }
}