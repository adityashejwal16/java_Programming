abstract class Animal
{
    public int i, j;
    public int Addition(int a, int b)
    {
        return a + b;
    }
}

class Dog extends Animal
{
   public int Substraction(int a, int b)
   {
     return a - b;
   }
   public int Multiplication(int a, int b)
   {
    return a * b;
   }
}

class abstrct
{
    public static void main(String A[])
    {
        Dog dobj = new Dog();
        int iRet = 0;

        iRet = dobj.Addition(10, 20);
        System.out.println(iRet);

        iRet = dobj.Substraction(20, 18);
        System.out.println(iRet);

        iRet = dobj.Multiplication(12, 10);
        System.out.println(iRet);
    }
}