class Base
{
   public int i,j;
   public int Addition(int a, int b)
   {
      return a+b;
   }
   abstract public int substraction(int a, int b);

}
clss Derived extends Base        // error
{

}

class Derivde extends Base
{
   public int x;
   
}
class AbstractDemo2
{
    public static void main(String A[])
    {
      
       Base bp=new Base();     //error
       
           



    }
}