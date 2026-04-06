class SubTwoNoGeneric
{
    public static <T extends Number> double Sub(T no1, T no2)
    {
        return no1.doubleValue() - no2.doubleValue();
    }

    public static void main(String A[])
    {
        System.out.println(Sub(50,20));
        System.out.println(Sub(10.5f,5.2f));
    }
}