import java.util.*;

class ToggleFirstandLast
{
    public static int ToggleBit(int iNo)
    {
        int mask = 0;
        mask = 0x0F | 0xF0;   // first + last nibble
        return (iNo ^ mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no = sobj.nextInt();

        System.out.println(ToggleBit(no));
    }
}