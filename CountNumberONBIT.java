import java.util.*;

class CountNumberONBIT
{
    public static int CountOne(int iNo)
    {
        int count = 0;

        while(iNo != 0)
        {
            if((iNo & 1) == 1)
            {
                count++;
            }
            iNo = iNo >> 1;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number : ");
        int no = sobj.nextInt();
        System.out.println("ON bits count : " + Bitwise.CountOne(no));
    }    
}    