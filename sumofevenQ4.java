class Logic
{
    void sumEvenOddDigit(int num)
    {
       int evenSum = 0;
        int oddSum = 0;
        int digit = 0;

        while(num != 0)
        {
            digit = num % 10;   

            if(digit % 2 == 0)      // even digit
            {
                evenSum = evenSum + digit;
            }
            else                    // odd digit
            {
                oddSum = oddSum + digit;
            }

            num = num / 10;         
        }

        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }
}
class sumofevenQ4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigit(123456);
    }
}