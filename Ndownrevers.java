class Logic
{
    void printReverse(int n)
    {
        for(int i=n; i>=0; i--)
        {
            System.out.println(i);
        }

    }
}
class Ndownrevers
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}