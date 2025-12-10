class Logic
{
    void findFactorial(int num)
    {
       int i = 0;
        for(i = 1; i<= (num /2);i++)
        {
             if(num%i==0)
            {
                System.out.println(i);
            }
        }
     
    }
}

public class factorial 
{
   public static void main(String A[])
   {
       Logic obj = new Logic();
       obj.findFactorial(5);  
   }   
}
