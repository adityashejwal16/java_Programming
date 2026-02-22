import java.util.Scanner;

class ASCIIDisplay
{
    
    static void Display(char ch)
    {
        System.out.println("Character     : " + ch);
        System.out.println("Decimal       : " + (int)ch);
        System.out.println("Octal         : " + Integer.toOctalString(ch));
        System.out.println("Hexadecimal   : " + Integer.toHexString(ch).toUpperCase());
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        char cValue;

        System.out.print("Enter the character: ");
        cValue = sobj.next().charAt(0);

        Display(cValue);
    }
}
