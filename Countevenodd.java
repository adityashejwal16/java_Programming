class Logic
{
    void countEvenOddRange(int n)
    {
        int Counteven=0;
        int Countodd=0;
        for(int i=1; i <=n;  i++)
        {
           
            if(i % 2 != 0)
            {
                Countodd++;
            }
            else
            {
                Counteven++;
            }
        }
        System.out.println("Total Even numbers: " + Counteven);
        System.out.println("Total Odd numbers: " + Countodd);
    }
}

class Countevenodd
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}
