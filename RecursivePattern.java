class RecursivePattern
{
    static int i = 1;

    public static void Display()
    {
        if(i <= 5)
        {
            System.out.println("*");
            i++;
            Display();
        }
    }

    public static void main(String A[])
    {
        Display();
    }
}