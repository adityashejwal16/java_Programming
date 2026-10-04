import java.util.*;

class Arith
{
    public float Add(float iNo1, float iNo2)
   {
      float fSum = 0.0f;
      fSum = iNo1 + iNo2;
      return fSum;
   }
}

class arithmatics6    
{
   public static void main(String[] A) 
   {
       Arith mobj = new Arith();
       float a = 0.0f, b = 0.0f;  

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the first Number : ");
       a = sobj.nextFloat();

       System.out.println("Enter the Seound Number : ");
       b = sobj.nextFloat();

       float iRet = mobj.Add(a, b);  // IMP logic
     
       System.out.println("Addition is " + iRet); 
   }
}