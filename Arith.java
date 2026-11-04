
abstract class Arithmatic
{
    public 
         int i = 0;
         int j = 0;

    public int Addition(int a, int b)
    {
        return a + b;
    }
    abstract public int Substraction(int a, int b);
}

class Derived extends Arithmatic(int a, int b)
{
    public int Subtraction(int a, int b)
    {
        return a - b;
    }
    public int Multiplication(int a, int b)
    {
        return a * b;
    }

}

class Arith
{
    public static void main(String A[])
    {
        Arithmatic ab = new Arithmatic();

        int iRet = 0;

        iRet = ab.Addition(11,10);
        System.out.println(iRet);

        iRet = ab.Substraction(10,20);
        System.out.println(iRet);

    }
}