class Logic
{
    void checkPlindrome(int num)
    {
        int i = num;
        int rev = 0;
        while(num!=0)
        {
            int digit = num % 10;
            rev = rev * 10+digit;
            num = num / 10;
        }
        if(i==rev)
        {
            System.out.println(i + "  is a palindrome number");
        }
        else
        {
            System.out.println(i + "is not palindrome number");
        }
    }
}
class plindrome
{
     public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPlindrome(121);
    }
}