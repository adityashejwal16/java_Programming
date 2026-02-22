import java.util.Scanner;

class SpecialCharacter
{
    
    static boolean ChkSpecial(char ch)
    {
        if (ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
            ch == '%' || ch == '^' || ch == '&' || ch == '*')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.print("Enter the character: ");
        cValue = sobj.next().charAt(0);

        bRet = ChkSpecial(cValue);

        if (bRet == true)
        {
            System.out.println("It is a special Character");
        }
        else
        {
            System.out.println("It is NOT a special Character");
        }
    }
}
