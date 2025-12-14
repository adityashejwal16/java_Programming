class Logic
{
    void findLargestDigit(int num)
    {
        int max=0;
        for(int i = num; i != 0; i = i / 10)
       {
          int digit = i % 10;
          if(digit > max)
        {
          max = digit;
        }
        System.out.println("Largest num is " + max);
       }
    }
}
class Largestdigit
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}