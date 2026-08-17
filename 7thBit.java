import java.util.*;

class Bit
{
    public static int OffBit(int iNo)
    {
        int mask = 0;
         mask = ~(1 << 6);
        return (iNo & mask);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int no = sobj.nextInt();

        System.out.println("Output : "+OffBit(no));
    }
}