class Ascii1
{
    static void DisplayASCII()
    {
        int i;
        for (i = 0; i <= 255; i++)
        {
            if (i < 32 || i == 127)
            {
                System.out.printf("N/A\t%d\t%X\t\t%o%n", i, i, i);
            }
            else
            {
                System.out.printf("%c\t%d\t%X\t\t%o%n", (char)i, i, i);
            }
        }
    }

    public static void main(String[] args)
    {
        DisplayASCII();
    }
}
