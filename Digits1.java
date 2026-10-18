
class Digits
{
    public static void main()
    {
        int iNo = 8572;
        int iDigit = 0;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo / 10;

    } 
}