class Logic
{
    void calculateSum(int n)
    {
        int sum = 0;

        for(int i = 1; i <= n; i++)
        {
            sum = sum + i;   // natural numbers
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}

public class sum_of_n 
{
   public static void main(String A[])
   {
       Logic obj = new Logic();
       obj.calculateSum(10);   // N = 10
   }   
}
