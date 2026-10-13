
class Demo
{
    public int iNo1;
    public int iNo2;

    public  Demo()   // Default Constructor
    {
        System.out.println("Inside default constructor");
    }
    public Demo(int i, int j)  // parameterized Constructor
    {
        System.out.println("Inside parameterized Constructor");
    }
    protected void finalize()   // ~Demo
    {
        System.out.println("Inside Finalize");
    }
}

class ConstructorDestructor 
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of main");
    }
}