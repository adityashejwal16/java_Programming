class Recursive5
{
    static char ch = 'a';

    public static void Display()
    {
        if(ch <= 'f')
        {
            System.out.print(ch + " ");
            ch++;
            Display();
        }
    }

    public static void main(String A[])
    {
        Display();
    }
}