

class MultiplyaGeneric
{
    public static <T extends Number> int Multiply(T No1, T No2)
    {
       return (int)(No1.doubleValue() * No2.doubleValue());
    }
    public static void main(String A[]) 
    {
        int iRet = Multiply(10,20);

        System.out.println(iRet);

        float fRet = Multiply(10.0f,20.0f);

        System.out.println(fRet);
    }
}