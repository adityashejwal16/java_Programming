class Logic
{
    void displayFactors(int num)
    {
        for(int i=1; i<=num; i++)
        {
            if( num % i ==0)
            {
                System.out.println("Factors number is " + i);
            }
        }
    }
}

class allFactors
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}
