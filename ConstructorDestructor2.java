
class Addition
{
    public int iNo1;
    public int iNo2;

    public  Addition()   // Default Constructor
    {
        System.out.println("Inside default constructor");
    }
    public Addition(int i, int j)  // parameterized Constructor
    {
        int iNo1 = i;
        int iNo2 = j;

        int iAns = iNo1 + iNo2;
        System.out.println("Inside parameterized Constructor " + iAns);
    }

    protected void finalize() 
    {
        System.out.println("Inside Finalize");
    }
}

class ConstructorDestructor1 
{
    public static void main(String A[])
    {
        Addition dobj1 = new Addition();
        Addition dobj2 = new Addition(11,21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of main");
    }
}