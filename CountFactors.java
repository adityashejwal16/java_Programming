class Logic
{
    void displayFactors(int num)
    {
        int Count=0;
        for(int i=1; i<=num; i++)
        {
            if( num % i ==0)
            {
                Count++;
                
            }
        }
        System.out.println("Total Factors: " + Count);
    }
}

class CountFactors
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayFactors(20);
    }
}
