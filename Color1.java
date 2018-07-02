class ColorException extends Exception
{
}
class WhiteException extends ColorException
{
}
public class Color1
{
  void m1() throws WhiteException
  {
    throw new ColorException();
  }
  void m2() throws ColorException
  {
    throw new WhiteException();
  }
  public static void main(String args[])
  {
    int a,b,c,d;
    a=b=c=d=0;
    Color1 w=new Color1();
    try{
     w.m1();
     a++;
     }catch(WhiteException we)
      {
        b++;
      }
    try{
       w.m2();
       c++;
       }catch(ColorException ce)
       {
         d++;
       }
     System.out.println(a+" "+b+" "+c+" "+d);
   }
}
    