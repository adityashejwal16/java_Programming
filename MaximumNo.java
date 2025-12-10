class Logic
{
    void findMax(int a, int b)
    {
    
       if(a > b)
       {
        System.out.println("Max is :" + a);
       }
       else 
       {
        System.out.println("Max is :" + b);
       }
    
    }
    
}
class MaximumNo
{
     public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);
    }
}