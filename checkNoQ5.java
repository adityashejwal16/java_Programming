class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println("Positive");
        }
        else if(num < 0)
        {
            System.out.println("Negtive");
        }
        else
        {
            System.out.println("Zero");
        }
    }
       
}
class checkNoQ5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}