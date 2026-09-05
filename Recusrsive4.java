
class Recursive4
{
    static char ch = 'A';

    public static void Display()
    {
        if(ch <= 'F')
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