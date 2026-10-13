
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
}

class Constructor1
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11,21);
    }
}