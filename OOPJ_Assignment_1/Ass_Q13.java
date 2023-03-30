/*13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */

 class Ass_Q13
{
  public static void main(String args[])
  {
     
      short sh=118;
      String str =Short.toString(sh);
      System.out.println("short value into String = "+str);

      Short sh1=Short.valueOf(sh);
      System.out.println("short value into Short instance = "+sh1);

      String str1="1234";
      Short B=Short.valueOf(str1);
      System.out.println("String instance into Short instance = "+B);



  }

}
