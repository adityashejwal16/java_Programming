class Logic
{
    void findMin(int a, int b, int c)
    {
    
      int min =a;
      if(b<min)
      {
        min = b;
      }
      else if(c < min)
      {
        min = c;
      }
      System.out.println( +min);
    }
    
}
class MinimumNo
{
     public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMin(3,7,2);
    }
}