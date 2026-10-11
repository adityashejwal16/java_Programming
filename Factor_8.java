import java.util.*;



class Factor
{
   void CountFactorNonFactor(int iNo)
   {
      int iCnt = 0,  iFrequency1 = 0, iFrequency2 = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      for(iCnt = 1; iCnt < iNo; iCnt++)
      {
         if((iNo % iCnt) == 0)
         {
            iFrequency1++;
         }
         else
         {
            iFrequency2++;
         }
      }

       System.out.println("number of factor are : " + iFrequency1);
       System.out.println("number of Non factor are : " + iFrequency2);
   }

}

class Factor_8
{
   public static void main(String A[])
   {
      int iValue = 0;

      Factor fobj = new Factor();

      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the Number : ");
      iValue = sobj.nextInt();

      fobj.CountFactorNonFactor(iValue);

   }
}