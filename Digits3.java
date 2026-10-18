
class Digits3
{
    public static void main()
    {
        int iNo = 8572;
        int iDigit = 0;

        System.out.println("-----------------------------------------------");
        System.out.println("Orignal value of iNO is  : " + iNo);

        System.out.println("-----------------------------------------------");
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        System.out.println("-----------------------------------------------");
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);
        
        System.out.println("-----------------------------------------------");
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        System.out.println("-----------------------------------------------");
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        System.out.println("-----------------------------------------------");


    } 
}