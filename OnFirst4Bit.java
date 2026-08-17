import java.util.*;

class OnFirst4Bit
{
    public static int OnBit(int iNo)
    {
        int mask = 0;
        mask = 15;   // 1111
        return (iNo | mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = sobj.nextInt();

        System.out.println(OnBit(no));
    }
}