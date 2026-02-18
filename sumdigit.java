class Logic
{
    void sumOfDigits(int num)
    {
        int iCount=0;
        for(iCount = 0; num != 0; num = num /10)   
        {
            iCount++;                         
        }
        System.out.println(iCount);
    }
}
class sumdigit
{
     public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}