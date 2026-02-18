class Logic
{
    void printEvenNumbers(int num)
    {
        for(int i = 1; i<=20; i++)
        {
            if(i % 2 ==0)
            {
                System.out.println(i);
            }
        }
    }
}
class primeToEvenNQ2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}