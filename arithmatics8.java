import java.util.*;


class Marvellous
{
   public float AdditionTwoNo(float fNo1, float fNo2)
   {
      float fSum = 0.0f;
      if(fNo1 < 0.0f)
      {
         fNo1 = -fNo1;
      }

      if(fNo2 < 0.0f)
      {
         fNo2 = -fNo2;
      }

      fSum = fNo1 + fNo2;

      return fSum;
   }
}

class arithmatics8
{
   public static void main(String A[])
   {
      float fValue1 = 0.0f, fValue2 = 0.0f;

      Marvellous mobj = new Marvellous();

      Scanner sobj = new Scanner(System.in);


      System.out.println("Enter thr first number : ");
      fValue1 = sobj.nextFloat();

      System.out.println("Enter the secound number : ");
      fValue2 = sobj.nextFloat();

      float fRet = mobj.AdditionTwoNo(fValue1, fValue2);

      System.out.println("Addition is : " + fRet);
   }
}