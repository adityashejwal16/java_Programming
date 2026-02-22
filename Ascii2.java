import java.util.Scanner;

class Ascii1
{
    static void Display(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
        {
            ch = (char)(ch - 32); 
        }
        else if (ch >= 'A' && ch <= 'Z')
        {0
            ch = (char)(ch + 32); 
        }

        System.out.println("Output: " + ch);
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the character:");
        char cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}
