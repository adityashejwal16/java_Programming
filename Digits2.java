
class Digits2
{
    public static void main()
    {
        int iNo = 8572;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;
        System.out.println(iNo);

    } 
}