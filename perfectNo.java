class Logic
{
    void checkPerfect(int num)
    {
        int i = 0;

        for(i = 1; i <=num ; i++)
        {
            if(num % i == 0)
            {
                System.out.println("its a perfect numbner = " + num);
            }
        }
    }
}
class perfectNo
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}