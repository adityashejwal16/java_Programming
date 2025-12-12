/* reverse number program
 */
class Logic
{
    void reverseNumber(int num)
    {
       int rev = 0;
       int digit = 0;
       while(num !=0)
       {
        digit = num % 10;
        rev = rev * 10 + digit;
        num = num /10;
       }
       System.out.println(rev);
    }
}
public class reverse 
{
   public static void main(String A[])
   {
       Logic obj = new Logic();
       obj.reverseNumber(1234);  
   }   
}
