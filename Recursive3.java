class Recursive3
{
    static int i = 5;

    public static void Display()
    {
        if(i >= 1)
        {
            System.out.println(i);
            i--;
            Display();
        }
    }

    public static void main(String A[])
    {
        Display();
    }
}