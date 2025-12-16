class Logic
{
    void checkDivisible(int num)
    {
       if(num % 5 == 0)
       {
        System.out.println("Divisible");
       }
       else
       {
        System.out.println("Not Divisible");
       }
    }
}
class divisible
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}