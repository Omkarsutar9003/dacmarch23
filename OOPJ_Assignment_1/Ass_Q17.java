
/*17. Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.
 */

class Ass_Q17
{
  public static void main(String args[])
  {

    Integer I=new Integer(1235);
    byte b=I.byteValue();
    System.out.println("Integer instance into byte = "+b);
    short sh=I.shortValue();
    System.out.println("Integer instance into short = "+sh);
    int n=I.intValue();
    System.out.println("Integer instance into int  = "+n);
    long l=I.longValue();
    System.out.println("Integer instance into long = "+l);
    float f=I.floatValue();
    System.out.println("Integer instance into float = "+f);
    double d=I.doubleValue();
    System.out.println("Integer instance into double = "+d);

  }

}