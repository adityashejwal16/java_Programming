
class Logic
{
    void checkPrime(int num)
    {
        int iCnt =0;
        if(num < 0)
        {
            num = -num;   // convert negative to positive
        }

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                iCnt++;
            }
        }

        if(iCnt == 2)
            System.out.println("its Prime");
        else
            System.out.println("Not Prime");
    }
}
class primeNoQ1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}