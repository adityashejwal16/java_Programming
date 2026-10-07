import java.util.*;


class Marvellous
{
   public int AdditionTwoNo(int iNo1, int iNo2)
   {
      int iSum = 0;
      iSum = iNo1 + iNo2;
      return iSum;
   }
}
class arithmatics7
{
   public static void main(String A[])
   {
      int iValue1 = 0, iValue2 = 0;

      Marvellous mobj = new Marvellous();

      Scanner sobj = new Scanner(System.in);


      System.out.println("Enter thr firdt number : ");
      iValue1 = sobj.nextInt();

      System.out.println("Enter the secound number : ");
      iValue2 = sobj.nextInt();

      int iRet = mobj.AdditionTwoNo(iValue1, iValue2);

      System.out.println("Addition is : " + iRet);
   }
}