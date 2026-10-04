import java.util.*;

class Arith
{
    public int Add(int iNo1, int iNo2)
   {
      int iSum = 0;
      iSum = iNo1 + iNo2;
      return iSum;
   }
}

class arithmatics5    
{
   public static void main(String[] A) 
   {
       Arith mobj = new Arith();
       int a = 0, b = 0;  

       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the first Number : ");
       a = sobj.nextInt();

       System.out.println("Enter the Seound Number : ");
       b = sobj.nextInt();

       int iRet = mobj.Add(a, b);  // IMP logic
     
       System.out.println("Addition is " + iRet); 
   }
}