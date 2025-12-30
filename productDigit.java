class Logic
{
    void productOfDigits(int num)
    {
        int product = 1;

        while (num != 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of digits is: " + product);
    }
}

class productDigit
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
