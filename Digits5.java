import java.util.*;


class Digits5
{
    public static void main()
    {
        int iNo = 0;
        int iDigit = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter The Number : ");
        iNo = sobj.nextInt();

        System.out.println("-----------------------------------------------");
        System.out.println("Orignal value of iNO is  : " + iNo);

        while(iNo != 0)
        {
         System.out.println("-----------------------------------------------");
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);
        }

        System.out.println("-----------------------------------------------");


    } 
}