/*.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
 */
class Ass_Q6
{
public static void main(String[] args)
 {
    System.out.println(" boolean value into String");
    boolean b1=true;
    String str =Boolean.toString(b1); // boolean value into String

    System.out.println(str);
    System.out.println("_______________________");

    System.out.println(" boolean value into Boolean instance.");
   Boolean B= Boolean.valueOf(b1); // boolean value into Boolean instance.

   System.out.println(B);
   System.out.println("_______________________");

   System.out.println("String value into boolean value");
   boolean b2=Boolean.parseBoolean(str);// String value into boolean value

   System.out.println(b2);
     String str2="Omkar";
   System.out.println("_______________________");
   System.out.println("String value into Boolean instance");
    Boolean B1 =Boolean.valueOf(str2); //String value into Boolean instance
    System.out.println(B1);
}

}