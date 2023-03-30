/*14.Write a program to convert state of Short instance into byte, 
short, int, long, float and double.
 */

class Ass_Q14
{
  public static void main(String args[])
  {
    Short Sh=new Short((short)1020);
    System.out.println(Sh);
   short s1=Sh.shortValue();
    System.out.println("convert state of Short instance into short= "+s1);
    byte b=Sh.byteValue();
    System.out.println("convert state of Short instance into byte = "+b);
   
   int a=Sh.intValue();
    System.out.println("convert state of Short instance into int = "+a);
    Long l=Sh.longValue();
    System.out.println("convert state of Short instance into long = "+l);
    float f=Sh.floatValue();
    System.out.println("convert state of Short instance into float = "+f);
    double d=Sh.doubleValue();
    System.out.println("convert state of Short instance into double = "+d);

  }

}