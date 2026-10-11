import java.util.*;


// Count Non Factor


class Factor
{
   int CountNonFactor(int iNo)
   {
      int iCnt = 0,  iFrequency = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      for(iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if((iNo % iCnt) != 0)
         {
            iFrequency++;
            System.out.println(iCnt);
         }
      }

      return iFrequency;
   }

}


class Factor_7
{
   public static void main(String A[])
   {
      int iValue = 0, iRet = 0;

      Factor fobj = new Factor();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      iRet = fobj.CountNonFactor(iValue);

      System.out.println("Number Of Factores Are : " + iRet);
   }
}