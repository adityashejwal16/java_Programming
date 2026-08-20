import java.util.*;

class CheckBitOnOFF
{
    public static boolean ChkBit(int iNo, int iPos)
    {
        int mask = 0;
        mask = 1 << (iPos - 1);

        if((iNo & mask) != 0)
            return true;
        else
            return false;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int no = sobj.nextInt();

        System.out.print("Enter position : ");
        int pos = sobj.nextInt();

        System.out.println(ChkBit(no,pos));
    }
}