import java.util.*;

class Toggle7Bit
{
    public static int ToggleBit(int iNo)
    {
         int mask = 0;
        mask = (1<<6);
        return (iNo ^ mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int no = sobj.nextInt();

        System.out.println(ToggleBit(no));
    }
}