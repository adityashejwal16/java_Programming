class Logic
{
    void countDigits(int num)
    {
       int iCount = 0;
      for(int n = num; n != 0; n = n / 10)   // divide each time
        {
            iCount++;                         // count di
        }
       
       System.out.println(iCount);
    } 
}
public class countNodigit 
{
   public static void main(String A[])
   {
       Logic obj = new Logic();
       obj.countDigits(7865);  
   }   
}
