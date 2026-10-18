
class Digits4
{
    public static void main()
    {
        int iNo = 8572631;
        int iDigit = 0;

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