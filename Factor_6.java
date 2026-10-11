import java.util.*;


// Count Factor


class Factor
{
   int CountFactor(int iNo)
   {
      int iCnt = 0,  iFrequency = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            iFrequency++;
         }
      }

      return iFrequency;
   }

}


class Factor_6
{
   public static void main(String A[])
   {
      int iValue = 0, iRet = 0;

      Factor fobj = new Factor();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      iRet = fobj.CountFactor(iValue);

      System.out.println("Number Of Factores Are : " + iRet);
   }
}