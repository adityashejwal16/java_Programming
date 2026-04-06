class DivGeneric
{
    public static <T extends Number> double Div(T no1, T no2)
    {
        if(no2.doubleValue() == 0)
        {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return no1.doubleValue() / no2.doubleValue();
    }

    public static void main(String A[])
    {
        System.out.println(Div(20,5));
        System.out.println(Div(10.5f,2.0f));
    }
}