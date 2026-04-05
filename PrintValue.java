class GenericDisplay
{
    // Generic Method
    public static <T> void Display(T value, int iSize)
    {
        for(int i = 0; i < iSize; i++)
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String A[])
    {
        Display('M',7);
        Display(11,3);
        Display(3.7,6);
    }
}