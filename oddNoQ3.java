class Logic
{
    void printOddNumbers(int num)
    {
        for(int i = 1; i<=20; i++)
        {
            if(i % 2 !=0)
            {
                System.out.println(i);
            }
        }
    }
}
class oddNoQ3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}