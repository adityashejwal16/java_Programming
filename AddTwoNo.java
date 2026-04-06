class AddTwoNoGeneric
{
    public static <T extends Number> double Add(T no1, T no2)
    {
        return no1.doubleValue() + no2.doubleValue();
    }

    public static void main(String A[])
    {
        double iRet = Add(10,20);
        System.out.println(iRet);

        double fRet = Add(10.5f,20.3f);
        System.out.println(fRet);
    }
}