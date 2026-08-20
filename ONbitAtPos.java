import java.util.*;

class ONBitAtPos
{
    public static int OnBit(int iNo, int iPos)
    {
        int mask = 0;
        mask = 1 << (iPos - 1);
        return (iNo | mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = sobj.nextInt();
        int pos = sobj.nextInt();

        System.out.println(OnBit(no,pos));
    }
}