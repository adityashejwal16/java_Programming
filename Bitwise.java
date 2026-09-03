import java.util.*;

class ToggleBitAtPos
{
    public static int ToggleBit(int iNo, int iPos)
    {
        int mask = 0;
        mask = 1 << (iPos - 1);
        return (iNo ^ mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = sobj.nextInt();
        int pos = sobj.nextInt();

        System.out.println(ToggleBit(no,pos));
    }
}